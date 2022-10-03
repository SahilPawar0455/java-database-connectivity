package com.bridgelabz;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;


public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to database");
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?userSSL=false";
        String name = "root";
        String password = "Sahil@6436";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is Loaded");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(jdbcURL,name,password);
            System.out.println("connection is successfully");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
