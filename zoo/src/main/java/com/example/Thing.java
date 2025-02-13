package com.example;

public abstract class Thing implements IInventory {
    protected int number;

    public Thing(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
