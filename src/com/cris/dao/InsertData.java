package com.cris.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertData {

	public boolean insertdata(HttpServletRequest req, HttpServletResponse res) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		//ResultSet rs=null;
		
		boolean flag;
		String loginid = req.getParameter("loginid");
		String password = req.getParameter("password");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cris", "root", "root");
			stmt = conn.prepareStatement("insert into login(user,pass)values(?,?)");
			
			stmt.setString(1, loginid);
			stmt.setString(2, password);
			int i = stmt.executeUpdate();
			//rs=stmt.executeQuery();
			
			
			if (i > 0) {
				System.out.println("inserted record...");
				
			} else {
				System.out.println("Not  insert Record...");
				

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			conn.close();
			stmt.close();
		}

	return true;
	}
}
