package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseConnection {
    public static Connection connection() {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?userSSL=false";
        String name = "root";
        String password = "Sahil@6436";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is Loaded");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(jdbcURL, name, password);
            System.out.println("connection is successfully");
            return connection;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
