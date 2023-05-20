package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
    public Connection madkeNewConnection() throws  ClassNotFoundException, SQLException{
        Class.forName("rg.h2.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:h2:tcp://localhost/~/springbook", "sa", "");

        return c;
    }
}
