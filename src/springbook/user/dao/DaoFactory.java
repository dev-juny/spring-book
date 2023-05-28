package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }
//    public AccountDao accountDao() {
//        return new AccountDao(new DConnectionMaker());
//    }
//    public MessageDao messageDao() {
//        return new MessageDao(new DConnectionMaker());
//    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }
}
