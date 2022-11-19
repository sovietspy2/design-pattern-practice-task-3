package org.example.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

// DO NOT CHANGE THIS FILE
public interface ConnectionPool {

    Connection getConnection() throws SQLException;

    boolean releaseConnection(Connection connection);

    List<Connection> getConnectionPool();

    int getSize();

    String getUrl();

    String getUser();

    String getPassword();

    void shutdown() throws SQLException;;
}