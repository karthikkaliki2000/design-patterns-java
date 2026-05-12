package com.design.patterns.structural.composite;

public class CompositeMain {
    public static void main(String[] args) {
        FileSystemComponent file1=new File("resume1.docx");
        FileSystemComponent file2=new File("text.docx");
        FileSystemComponent file3=new File("photo.png");

        Folder folder=new Folder("documents");
        folder.addChild(file1);
        folder.addChild(file2);
        folder.addChild(file3);
        folder.showDetails();
    }
}
