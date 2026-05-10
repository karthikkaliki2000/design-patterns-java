package com.design.patterns.creational.builder;

public class PhoneBuilder {

    private String name;

    private int ram;

    private int memory;

    private int size;

    private String os;

    private int battery;

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    public PhoneBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(name,ram,memory,size,os,battery);
    }
}
