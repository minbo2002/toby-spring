package com.example.tobyspring.user.dao;

import com.example.tobyspring.user.connection.ConnectionMaker;

public class AccountDao {

    private ConnectionMaker connectionMaker;

    public AccountDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
