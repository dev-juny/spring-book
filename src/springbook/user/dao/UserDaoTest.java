package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDaoTest {

    public static void main(String[] args) throws  ClassNotFoundException, SQLException {
        UserDao dao = new DaoFactory().userDao();
    }
}
