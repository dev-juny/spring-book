package springbook.user.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springbook.user.domain.User;

import java.sql.*;

public class UserDao {
    private ConnectionMaker connectionMaker;

    public UserDao() {
        //connectionMaker = new DConnectionMaker(); 이렇게하면 의존관계를 잘못 설정함.

        //이렇게 해도상관 없지만 외부로 부터의 주입이아님
        /*DaoFactory daoFactory = new DaoFactory();
        this.connectionMaker = daoFactory.connectionMaker();*/

        //의존관계 검색을 이용하는 UserDao생성자 (DL)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        this.connectionMaker = context.getBean("connectionMaker", ConnectionMaker.class);

    }


    //의존관계 주입을 위한 코드
    public UserDao(ConnectionMaker connectionMaker){
        this.connectionMaker = connectionMaker;
    }



    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection c = connectionMaker.makeConnection();
        //...
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection c = connectionMaker.makeConnection();
        //...
        return null;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:h2:tcp://localhost/~/springbook", "sa", "");
        return c;
    }
}
