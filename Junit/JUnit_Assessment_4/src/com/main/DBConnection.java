package com.main;

import java.beans.Statement;
import java.sql.*;


public class DBConnection {
	Connection conn = null;
	   Statement stmt = null;
	public String  connect(String drivername,String url,String username,String pwd) 
	{ String res=null;
		try{
		Class.forName(drivername);
		
		conn = DriverManager.getConnection(url,username,pwd);
boolean constate=conn.isClosed();
if(!constate)
{
	res="success";
}
else
	{res="failure";}
conn.close();
		}
		catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		return pwd;
		
}
}