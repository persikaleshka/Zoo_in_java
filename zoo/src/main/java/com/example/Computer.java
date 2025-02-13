package com.example;

public class Computer extends Thing {
    public Computer(int number) {
        super(number);
    }

    @Override
    public String getThingType() {
        return "Компьютер";
    }
}
