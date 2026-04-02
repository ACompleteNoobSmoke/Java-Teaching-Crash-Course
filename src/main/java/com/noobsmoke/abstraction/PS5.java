package com.noobsmoke.abstraction;

public class PS5 implements ElectronicFunctionality {

    String type;

    public PS5() {
        this.type = "Playstation 5";
    }

    @Override
    public void on() {
        System.out.println(type + ": Turned on!");
    }

    @Override
    public void off() {
        System.out.println(type + ": Turned off!");
    }

    @Override
    public void standby() {
        System.out.println(type + ": On Standby");
    }

    @Override
    public void restart() {
        System.out.println(type + ": Has been restarted");
    }

    @Override
    public void printElectronic() {
        System.out.println("This is a " + type);
    }
}
