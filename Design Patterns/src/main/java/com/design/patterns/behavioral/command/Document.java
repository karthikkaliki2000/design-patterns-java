package com.design.patterns.behavioral.command;
//receiver means actual object that works as commands
public class Document {
    public void save(){
        System.out.println("Document Saved");
    }

    public void print(){
        System.out.println("Document Printed");
    }
}
