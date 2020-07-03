package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testjdbc {

	public static void main(String[] args) {
		
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?allowPublicKeyRetrieval=true&useSSL=false";
		String user="root";
		String password="admin";
		try {
			System.out.println("connecting to database: "+jdbcUrl);
			Connection con=DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("connection successful");
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
