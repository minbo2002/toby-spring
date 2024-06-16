package com.example.tobyspring;

import com.example.tobyspring.user.User;
import com.example.tobyspring.user.dao.ConnectionMaker;
import com.example.tobyspring.user.dao.CConenctionMaker;
import com.example.tobyspring.user.dao.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SpringApplication.run(UserDaoTest.class, args);

        ConnectionMaker connectionMaker = new CConenctionMaker();
        UserDao dao = new UserDao(connectionMaker);

        User user = new User();
        user.setId("minbo");
        user.setName("김민보");
        user.setPassword("1234");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + " 조회 성공");
    }
}
