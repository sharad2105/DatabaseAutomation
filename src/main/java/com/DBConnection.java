package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver is loaded!!!!!");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Sharad@1998");
        System.out.println("Connection is Success");

        PreparedStatement preparedStatement = connection.prepareStatement("insert into employee_detail values (?, ?, ?, ?);");
        preparedStatement.setInt(1, 5);
        preparedStatement.setString(2, "chetan");
        preparedStatement.setDouble(3, 45000.0);
        preparedStatement.setString(4, "Nashik");
        int x = preparedStatement.executeUpdate();
        if (x > 0){
            System.out.println("Insert Data is Success");
        }
        else {
            System.out.println("Insert data is failed");
        }
        connection.close();
    }		

	}