package com.my.pro.sql.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class SQLHelper {
	
	private final String url = "jdbc:mysql://localhost:3306/mypro?user=root&password=&useUnicode=true&characterEncoding=UTF8";
	
	private static SQLHelper helper=null;
	
	private Connection conn = null;
	private PreparedStatement  stmt =null;
	private ResultSet rs=null;
	
	private SQLHelper(){
	}
	
	
	public static SQLHelper inistance(){
		if(helper==null){
			helper=new SQLHelper();
		}
		return helper;
	}
	
	/**
	 * @param sql
	 * @return
	 */
	public ResultSet query(String sql){
			try {
				conn=SQLHelper.inistance().createConnection();
				stmt = conn.prepareStatement(sql);
				rs = stmt.executeQuery();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rs;
	}

	public int update(String sql){
		int rs=-1;
		try {
			conn=SQLHelper.inistance().createConnection();
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	private Connection createConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url);
		return conn;
	}
	
	/**
	 * @return Connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection getHander() throws ClassNotFoundException, SQLException{
		if(conn==null){
			return createConnection();
		}else{
			return conn;
		}
	}
	
	public void close(){
		try {
			if(conn!=null){conn.close();} 
			if(stmt!=null){stmt.close();}
			if(rs!=null){rs.close();}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		conn=null;
		stmt=null;
		rs=null;
	}
}
