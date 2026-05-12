package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{

    private String name;

    private List<FileSystemComponent> children=new ArrayList<>();

    public Folder(String name){
        this.name=name;
    }

    public void addChild(FileSystemComponent child){
        children.add(child);
    }
    @Override
    public void showDetails() {
        System.out.println("Folder: "+name);
        for(FileSystemComponent child:children){
            child.showDetails();
        }

    }
}
