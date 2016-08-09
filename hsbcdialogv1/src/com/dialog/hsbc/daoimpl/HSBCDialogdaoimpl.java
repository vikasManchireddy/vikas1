package com.dialog.hsbc.daoimpl;

import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.dialog.hsbc.dao.HSBCDialogdao;
//import com.dialog.hsbc.utils.ServiceLocator;
import com.dialog.hsbc.utils.ServiceLocatorException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@Repository("hSBCDialogdao")
public class HSBCDialogdaoimpl implements HSBCDialogdao{
	
	private DataSource dataSource;
	private Connection connection;
	PreparedStatement selectStatement;
	private String selectQuery;
	private ResultSet result ;
	

public HSBCDialogdaoimpl()  {
		
//		try {
//			dataSource=ServiceLocator.getDataSource("jdbc/VIMDataSource");
//			
//		} catch (ServiceLocatorException e) {
//			
//			System.out.println("Container Service not available");
//		}//catch block closed
		
	} //method closed
	
	
	@Override
	public int getAnnualLeaveBalance() {
		// TODO Auto-generated method stub
		
		
		
		return 6;
	}

}
