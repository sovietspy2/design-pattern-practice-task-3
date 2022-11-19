package org.example.customer;

import org.example.db.BasicConnectionPool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private BasicConnectionPool basicConnectionPool = new BasicConnectionPool(
            "jdbc:sqlite:App.db",
            "sa",
            "",
            new ArrayList<>()
    );

    public CustomerService() throws InterruptedException {
    }

    // DO NOT CHANGE THIS METHOD
    public String getCustomer(String name) {
        // implementation
        return null;
    }

    // Do not change this method
    public List<String> getCustomers() throws SQLException {

        Connection connection = basicConnectionPool.getConnection();

        String sql = "SELECT NAME FROM CUSTOMER;";

        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery(sql);

        List<String> customers = new ArrayList<>();

        while (rs.next()) {
            customers.add(rs.getString("name"));
            System.out.println("Loading customer data: " + rs.getString("name"));
        }

        connection.close();

        return customers;
    }

}
