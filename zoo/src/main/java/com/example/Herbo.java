package com.example;

public abstract class Herbo extends Animal {
    private int kindnessLevel;  

    public Herbo(int food, int kindnessLevel) {
        super(food);
        this.kindnessLevel = kindnessLevel;
    }

    public int getKindnessLevel() {
        return kindnessLevel;
    }

    @Override
    public String getAnimalType() {
        return "Травоядное";
    }
}
