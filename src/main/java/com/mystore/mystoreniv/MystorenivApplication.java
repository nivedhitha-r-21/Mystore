package com.mystore.mystoreniv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MystorenivApplication {

	public static void main(String[] args) {
		SpringApplication.run(MystorenivApplication.class, args);
		System.out.println("Process started!");
		connectData();
	}

	public static void connectData(){
		String url = "jdbc:mysql://localhost:3306/myappdev";
		String user = "root";
		String pass = "Skcet@123";

		try(Connection conn = DriverManager.getConnection(url, user, pass)){
			if(conn != null){
				System.out.print("Connections successfull");
			}
		}
		catch (SQLException e) {
			System.out.println("Connection failed");
		}
	}
}
