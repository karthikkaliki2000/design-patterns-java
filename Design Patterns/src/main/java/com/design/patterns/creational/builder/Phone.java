package com.design.patterns.creational.builder;

public class Phone {

    private String name;

    private int ram;

    private int memory;

    private int size;

    private String os;

    private int battery;

    public Phone(String name, int ram, int memory, int size, String os, int battery) {
        this.name = name;
        this.ram = ram;
        this.memory = memory;
        this.size = size;
        this.os = os;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", memory=" + memory +
                ", size=" + size +
                ", os='" + os + '\'' +
                ", battery=" + battery +
                '}';
    }
}
