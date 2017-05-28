package com.java.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class bao {

	private String className="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/db_memomodule";
	private String user="root";
	private String password="liu1988226";
	
	protected Connection conn=null;
	protected PreparedStatement ps=null;
	protected ResultSet rs=null;
	
	public Connection getconnection(){
	
		try{
			 Class.forName(className);
			 
			 
		}catch(ClassNotFoundException e){
			
			e.printStackTrace();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		return conn;
		
		
		
		
	}
	
	
	
}
