package com.bridgelabz;
import java.sql.*;
import java.util.Enumeration;


public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to database");
        Connection connection = DatabaseConnection.connection();
        PreparedStatement preparedStatement = connection.prepareStatement("update payroll_service.employee_payroll set salary = 300005 where name = 'sahil'");
        preparedStatement.execute();
        ResultSet resultSet = preparedStatement.executeQuery("select * from payroll_service.employee_payroll");
        System.out.println("update salary in Employee Payroll service");
        System.out.println("Retrive the Employee Payroll");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name")
                    + " " + resultSet.getString("start")+"  "+resultSet.getDouble("salary"));
        }
    }
}
