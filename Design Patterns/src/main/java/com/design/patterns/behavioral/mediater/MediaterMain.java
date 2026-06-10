package com.design.patterns.behavioral.mediater;

import java.util.Scanner;

public class MediaterMain {

    public static void main(String[] args) {
        ChatMediater chat=new ChatMediater();

        User karthik=new User("Karthik",chat);

        User ravi=new User("Ravi",chat);
        Scanner scan=new Scanner(System.in);
        do{
            
            karthik.send(scan.next());
            ravi.send(scan.next());
        } while (true);
    }
}
