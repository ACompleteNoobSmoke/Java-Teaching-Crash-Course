package com.noobsmoke.abstraction;

public abstract class BasicActions {

    String type;

    public BasicActions(String type) {
        this.type = type;
    }

    public void open() {
        System.out.println(type + " is open");
    }

    public void close() {
        System.out.println(type + " is closed");
    }

    public void print() {
        System.out.println(type);
    }
}
