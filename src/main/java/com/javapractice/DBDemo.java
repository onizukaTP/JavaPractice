package com.javapractice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class DBDemo {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false&serverTimezone=UTC";
        String username = "root";
        String password = "root";
        Connection connection;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded.");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        listDrivers();

        try {
            System.out.println("Connecting to database: " + jdbcUrl);
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection is successful: " + connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void listDrivers() {
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        while (driverList.hasMoreElements()) {
            Driver driverClass = driverList.nextElement();
            System.out.println("Loaded driver: " + driverClass.getClass().getName());
        }
    }
}
