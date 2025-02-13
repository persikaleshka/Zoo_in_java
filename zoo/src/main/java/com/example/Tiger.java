package com.example;

public class Tiger extends Predator {
    public Tiger(int food) {
        super(food);
    }

    @Override
    public String getAnimalType() {
        return "Тигр";
    }
}
