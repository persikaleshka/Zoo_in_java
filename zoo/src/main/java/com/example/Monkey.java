package com.example;

public class Monkey extends Herbo {
    public Monkey(int food, int kindnessLevel) {
        super(food, kindnessLevel);
    }

    @Override
    public String getAnimalType() {
        return "Обезьяна";
    }
}
