package com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.sql.PreparedStatement;

public class bao {

	private String className = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/db_memomodule";
	private String user = "root";
	private String password = "liu1988226";
	protected Connection conn = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;

	public Connection getconnection() {

		try {
			Class.forName(className);
			conn= DriverManager.getConnection(url,user, password);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}

		return conn;

	}
	
	
	
	//插入,修改,删除等操作的命令,没有返回结果集合的都可以操作.
	public void update (String sql ,Object[] wanneng ){
		conn=this.getconnection();
	try {
	ps=conn.prepareStatement(sql);
	
	if(wanneng !=null)
	{
		for (int i=0;i<wanneng.length;i++){
			ps.setObject(i+1, wanneng[i]);

		}
		
	}
	//执行sql语句
		ps.executeQuery();
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		
		this.clone(conn,ps,rs);
	}
		
	}
	
	//查询语句 返回个结果集合
	public  ResultSet getresultset(String sql,Object[] wanneng){
		conn=this.getconnection();
		try {
			ps=conn.prepareStatement(sql);
			if(wanneng!=null)
			{
				for(int i=0;i<wanneng.length;i++){
					ps.setObject(i+1, wanneng[i]);
				}
				
			}
			rs=ps.executeQuery();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
		return rs;
		
		
	}
	
	

	private void clone(Connection conn2, PreparedStatement ps2, ResultSet rs2) {
		// TODO Auto-generated method stub
		try {
			if(rs!=null){
				rs.close();
				rs=null;
			}if(ps!=null)
			{
				ps.close();
				ps=null;
				
				
			}
			if(conn!=null){
				conn.close();
				conn=null;
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
