package org.example;

import org.example.customer.CustomerService;
import org.example.product.ProductService;
import org.example.utils.Timer;

import java.sql.SQLException;
import java.util.List;

// DO NOT CHANGE THIS FILE
public class Application {
    public static void main(String[] args) throws InterruptedException, SQLException {

        Timer timer = new Timer(10_000L);

        CustomerService customerService = new CustomerService();
        ProductService productService = new ProductService();

        List<String> customers = customerService.getCustomers();

        List<String> products = productService.getCustomers();

        assert products.equals(List.of("Toy Gun", "Space Gun"));
        assert customers.equals(List.of("Bob", "Billy"));

        timer.stop();
        System.out.println("The app is performing at a reasonable speed!");
    }
}