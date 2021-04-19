package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver is loaded!!!!!");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Sharad@1998");
        System.out.println("Connection is Success");

        PreparedStatement pst = connection.prepareStatement("select * from employee_detail;");
        
        ResultSet rs =pst.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt(1)+ "  "+ rs.getString(2)+
                                "  " + rs.getDouble(3) + "  " + rs.getString(4));
        }
        connection.close();
    }
}
