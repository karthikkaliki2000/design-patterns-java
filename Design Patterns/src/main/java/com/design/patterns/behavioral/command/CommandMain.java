package com.design.patterns.behavioral.command;

public class CommandMain {
    public static void main(String[] args) {
        Document document=new Document();

        CommandInvoker commandInvoker=new CommandInvoker();
        commandInvoker.setCommand(new SaveCommand(document));
        commandInvoker.run();
        commandInvoker.setCommand(new PrintCommand(document));
        commandInvoker.run();


    }
}
