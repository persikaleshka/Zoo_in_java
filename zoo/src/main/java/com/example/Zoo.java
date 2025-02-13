package com.example;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;


public class Zoo {
    private List<IAlive> animals = new ArrayList<>();
    private List<IInventory> inventory = new ArrayList<>();
    private VeterinaryClinic clinic;

    @Inject
    public Zoo(VeterinaryClinic clinic) {
        this.clinic = clinic;
    }

    public void addAnimal(IAlive animal) {
        if (clinic.checkHealth(animal)) {
            animals.add(animal);
            System.out.println("Животное принято в зоопарк.");
        } else {
            System.out.println("Животное не прошло проверку здоровья.");
        }
    }

    public void addInventory(IInventory item) {
        inventory.add(item);
        System.out.println("Инвентарь добавлен: " + item.getClass().getSimpleName() + " №" + item.getNumber());
    }

    public int calculateTotalFood() {
        return animals.stream().mapToInt(IAlive::getFood).sum();
    }

    public void listAnimals() {
        System.out.println("Животные в зоопарке:");
        animals.forEach(animal -> System.out.println(animal.getClass().getSimpleName()));
    }

    public void listInventory() {
        System.out.println("Инвентарь зоопарка:");
        inventory.forEach(item -> System.out.println(item.getThingType() + " №" + item.getNumber()));
    }
}