package com.example;

public class Table extends Thing {
    public Table(int number) {
        super(number);
    }

    @Override
    public String getThingType() {
        return "Стол";
    }
}
