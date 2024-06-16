package com.example.tobyspring.user.dao;

import com.example.tobyspring.user.connection.ConnectionMaker;

public class MessageDao {

    private ConnectionMaker connectionMaker;

    public MessageDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
