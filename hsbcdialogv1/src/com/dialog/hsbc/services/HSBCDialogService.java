package com.dialog.hsbc.services;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dialog.hsbc.dto.DialogDTO;
import com.dialog.hsbc.dto.HSBCDialogProps;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.watson.developer_cloud.dialog.v1.DialogService;
import com.ibm.watson.developer_cloud.dialog.v1.model.Conversation;

@Service
public class HSBCDialogService {

	private static final Logger logger = Logger.getLogger(HSBCDialogService.class);
	@Autowired
	HSBCDialogProps hsbcDialogProps;
	
	@Autowired
	DialogService dialogService;
	
	public DialogDTO getDialog()
	{
		return new DialogDTO();
	}
	public DialogDTO getNextDialog(DialogDTO dialogDTO)
	{
		dialogService.setUsernameAndPassword(hsbcDialogProps.getUserName(), hsbcDialogProps.getPassword());
		//List<Dialog> dialogs = dialogService.getDialogs();
		
		Map<String,Object> params = new HashMap<String,Object>();
		
		params.put(DialogService.DIALOG_ID,hsbcDialogProps.getDialogId());
		
		params.put(DialogService.INPUT, dialogDTO.getInput());
		
		if(dialogDTO.getClient_id()!=null)
		{
			/*try {
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}*/
			params.put(DialogService.CLIENT_ID, dialogDTO.getClient_id());
		}
		if(dialogDTO.getConversation_id()!=null)
		{
			params.put(DialogService.CONVERSATION_ID, dialogDTO.getConversation_id() );
		}

		Conversation conversation = dialogService.converse(params);
		logger.info("Response Data in Service:");
		logger.info(conversation);
		try
		{
		//FileInputStream inputStream = new FileInputStream(conversation.toString());
		//String response = StringUtils.getStringFromInputStream(inputStream);
		InputStream inputStream2 = new ByteArrayInputStream(conversation.toString().getBytes("UTF-8"));
		ObjectMapper mapper = new ObjectMapper();
		DialogDTO dialogDTO2 = new DialogDTO();
		dialogDTO2 = mapper.readValue(inputStream2, DialogDTO.class);

		//logger.info(dialogs);
		logger.info(hsbcDialogProps);
		logger.info(dialogDTO);
		return dialogDTO2;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public void setHsbcDialogProps(HSBCDialogProps hsbcDialogProps) {
		this.hsbcDialogProps = hsbcDialogProps;
	}
	
	public void retrievData(){
		
	
	}
}
