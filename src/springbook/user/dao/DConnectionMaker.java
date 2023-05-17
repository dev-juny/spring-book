package springbook.user.dao;

import springbook.user.domain.User;

import java.sql.Connection;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker{
    private ConnectionMaker connectionMaker;

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        return null;
    }


}
