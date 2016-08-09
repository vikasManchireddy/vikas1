package com.dialog.hsbc.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dialog.hsbc.dao.HSBCDialogdao;
import com.dialog.hsbc.dto.DialogDTO;
import com.dialog.hsbc.services.HSBCDialogService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HSBCDialogController {

	private static final Logger logger = Logger.getLogger(HSBCDialogController.class);
	@Autowired
	HSBCDialogService hsbcDialogService;
	
	@Autowired
	HSBCDialogdao hSBCDialogdao;
	
	@RequestMapping(value="/hello",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String helloWorld(HttpServletRequest request, HttpServletResponse response)
	{
		String clientMSG = request.getParameter("clientMSG");
		ObjectMapper mapper = new ObjectMapper();
		DialogDTO dialogDTO = new DialogDTO();
		try
		{
			dialogDTO = mapper.readValue(clientMSG, DialogDTO.class);
			logger.info("Client Request:");
			logger.info(dialogDTO);
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		logger.info(clientMSG);
		DialogDTO responseDTO = hsbcDialogService.getNextDialog(dialogDTO);
		
		
		
		/*
		 * my code
		 * 
		 */

		if ((responseDTO.getResponse())[0].equals("RS1001"))
		{
			dialogDTO=responseDTO;
			int k=0;
			k=hSBCDialogdao.getAnnualLeaveBalance();
			dialogDTO.setInput("RP1001,"+k);

			responseDTO = hsbcDialogService.getNextDialog(dialogDTO);
		}

		/**/

		

		String responseMSG="";
		try {
			
			responseMSG = mapper.writeValueAsString(responseDTO);
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}
		
		logger.info("Response String:" +responseMSG);
		
		/*String responseMSG="";
		if(dialogDTO.getInput()==null||"".equals(dialogDTO.getInput()))
		{
			responseMSG=jsonInString;
		}
		else
		{
			
			try {
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			responseMSG=jsonInString;
		}*/
		
		return responseMSG;
	}
}
