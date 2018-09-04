package com.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 DBConnection obj=new DBConnection();
System.out.print("Connection is " + obj.connect("com.mysql.jdbc.Driver", "dbc:mysql://localhost/Madhu", "SYSTEM", "SYSTEM"));
 
	}

}
