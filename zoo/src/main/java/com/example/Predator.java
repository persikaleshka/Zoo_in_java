package com.example;

public abstract class Predator extends Animal {
    public Predator(int food) {
        super(food);
    }

    @Override
    public String getAnimalType() {
        return "Хищник";
    }
}
