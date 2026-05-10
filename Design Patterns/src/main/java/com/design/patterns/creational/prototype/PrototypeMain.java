package com.design.patterns.creational.prototype;

public class PrototypeMain {

    public static void main(String[] args) {



        MetaData originalMetaData=new MetaData("Karthik");
        Document originalDocument=new Document("Java",originalMetaData);

        Document documentCopy1=(Document)originalDocument.shallowClone();

        Document documentCopy2=(Document)originalDocument.deepClone();

        System.out.println("Original");
        System.out.println(originalDocument.hashCode());
        System.out.println(originalDocument.getMetadata().hashCode());

        System.out.println("------------------------------------------");
        System.out.println("Shallow Clonning");
        System.out.println(documentCopy1.hashCode());
        System.out.println(documentCopy1.getMetadata().hashCode());


        System.out.println("------------------------------------------");
        System.out.println("Deep Clonning");
        System.out.println(documentCopy2.hashCode());
        System.out.println(documentCopy2.getMetadata().hashCode());


    }

}
