package com.design.patterns.behavioral.mediater;

public class User {

    private String userName;


    private ChatMediater chatMediater;

    public User(String userName,ChatMediater chatMediater){
        this.chatMediater=chatMediater;
        this.userName=userName;
    }

    public void send(String message){
        chatMediater.showMessage(message,userName);
    }
}
