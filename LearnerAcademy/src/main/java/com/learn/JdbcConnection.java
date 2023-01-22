package com.learn;


import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcConnection {
	
	
	static Connection con =null;
	public static void main(String[] args) throws Exception {
	JdbcConnection connection=new JdbcConnection();
	connection.getConnection();
	}
	public Connection getConnection() throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	String url ="jdbc:mysql://localhost:3306/lern_acdemy";
	String userName="root";
	String password="root";
	con =DriverManager.getConnection(url,userName,password);
	System.out.println("SUCESS");
	return null;

}
}