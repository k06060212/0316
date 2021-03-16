package com.atworks.kjh;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MariaDBConnectionTest {
	
	
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://192.168.0.7/shopingmall";
	private static final String USER = "root";
	private static final String PW = "wongi0595";
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		try (Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
			
			System.out.println("성공");
			
		}catch(Exception e) {
			System.out.println("성공");
			e.printStackTrace();
		}
	}
}
