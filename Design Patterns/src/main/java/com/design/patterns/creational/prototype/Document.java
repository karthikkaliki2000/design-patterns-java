package com.design.patterns.creational.prototype;

import javax.print.Doc;
import java.util.Objects;

public class Document implements Prototype,Cloneable{

    private String content;

    private MetaData metadata;

    public Document(String content, MetaData metaData) {
        this.content=content;
        this.metadata=metaData;
    }

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //only main object cloneed nad nested objects are same  as original references
    @Override
    public Prototype shallowClone() {
        return this.clone();
    }

    //nested objects are also clonned
    @Override
    public Prototype deepClone() {
            Document clone=new Document(this.content,new MetaData(this.metadata));
            return clone;

    }

    @Override
    public Document clone() {
        try {
            Document clone = (Document) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Document document = (Document) o;
//        return Objects.equals(content, document.content) && Objects.equals(metadata, document.metadata);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(content, metadata);
//    }
}
