package com.bridgelabz;
import java.sql.*;


public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to database");
        Connection connection = DatabaseConnection.connection();
        Statement statement = connection.createStatement();
        statement.execute("update payroll_service.employee_payroll set salary = 300005 where name = 'sahil'");
        ResultSet resultSet = statement.executeQuery("select * from payroll_service.employee_payroll where start between cast('2022-06-01' as date) and date(now())");
        System.out.println("update salary in Employee Payroll service");
        System.out.println("Retrive the Employee Payroll");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name")
                    + " " + resultSet.getString("start")+"  "+resultSet.getDouble("salary"));
        }
    }
}
