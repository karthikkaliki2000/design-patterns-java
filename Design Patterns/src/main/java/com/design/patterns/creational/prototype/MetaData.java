package com.design.patterns.creational.prototype;

public class MetaData {

    private String author;

    public MetaData(String author) {
        this.author = author;
    }

    //copy constructor

    public MetaData(MetaData otherMetaData){
        this.author=otherMetaData.author;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "author='" + author + '\'' +
                '}';
    }
}
