package com.example;

public class Wolf extends Predator {
    public Wolf(int food) {
        super(food);
    }

    @Override
    public String getAnimalType() {
        return "Волк";
    }
}
