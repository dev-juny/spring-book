package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class NConnectionMaker implements ConnectionMaker{
    private ConnectionMaker connectionMaker;

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        //여기에 N회사에서 적용할 예정
        return null;
    }


}
