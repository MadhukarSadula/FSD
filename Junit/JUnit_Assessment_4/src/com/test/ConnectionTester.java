package com.test;
import com.main.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class ConnectionTester {
@Test
	public void testConnection()
	{
		boolean actual;
		DBConnection obj=new DBConnection();
String res=obj.connect("com.mysql.jdbc.Driver", "dbc:mysql://localhost/Madhu", "SYSTEM", "SYSTEM");
 	if(res.equals("success"))
 	{
 		actual=true;
 	}
 	else
 	{
 		actual=false;
 	}
 	assertTrue(actual);

	}
@Test
public void testConnection2()
{
	boolean actual;
	DBConnection obj=new DBConnection();
String res=obj.connect("com.mysql.jdbc.Driver", "jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "SYSTEM");
	if(res.equals("success"))
	{
		actual=true;
	}
	else
	{
		actual=false;
	}
	assertTrue(actual);

}
	
}
