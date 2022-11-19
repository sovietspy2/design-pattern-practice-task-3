package org.example.product;

import org.example.db.BasicConnectionPool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private BasicConnectionPool basicConnectionPool = new BasicConnectionPool(
            "jdbc:sqlite:App.db",
            "sa",
            "",
            new ArrayList<>()
    );

    public ProductService() throws InterruptedException {
    }

    // Do not change this method
    public List<String> getCustomers() throws SQLException {

        Connection connection = basicConnectionPool.getConnection();

        String sql = "SELECT NAME FROM PRODUCT;";

        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery(sql);

        List<String> products = new ArrayList<>();

        while(rs.next()) {
            products.add(rs.getString("name"));
            System.out.println("Loading customer data: "+rs.getString("name"));
        }

        connection.close();

        return products;
    }

    // DO NOT CHANGE THIS METHOD
    public String getProduct(String name) {
        // implementation
        return null;
    }

}
