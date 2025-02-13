package com.example;

public abstract class Animal implements IAlive {
    protected int food;  

    public Animal(int food) {
        this.food = food;
    }

    @Override
    public int getFood() {
        return food;
    }

    public abstract String getAnimalType();

    @Override
    public String toString() {
        return getAnimalType() + " (потребление пищи: " + food + " кг/день)";
    }
}
