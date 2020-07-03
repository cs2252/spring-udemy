package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServelt
 */
@WebServlet("/TestDbServelt")
public class TestDbServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user="springstudent";
		String password="springstudent";
		String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver="com.mysql.jdbc.Driver";
		System.out.println("insdie goGet methdo");
		
		try {
			PrintWriter out=response.getWriter();
			out.println("connection to databse"+jdbcUrl);
			
			Class.forName(driver);
			Connection con=DriverManager.getConnection(jdbcUrl,user,password);
			
			out.println("success!!");
			
			con.close();
			
		}catch(Exception ex) {
			
			System.out.println("something went wrong");
		}
		
	}

}
