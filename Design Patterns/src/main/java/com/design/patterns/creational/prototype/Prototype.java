package com.design.patterns.creational.prototype;

public interface Prototype {

    Prototype shallowClone();

    Prototype deepClone();
}
