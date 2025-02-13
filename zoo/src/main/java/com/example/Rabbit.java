package com.example;

public class Rabbit extends Herbo {
    public Rabbit(int food, int kindnessLevel) {
        super(food, kindnessLevel);
    }

    @Override
    public String getAnimalType() {
        return "Кролик";
    }
}
