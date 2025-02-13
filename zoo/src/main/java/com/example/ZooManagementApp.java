package com.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ZooManagementApp {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ZooModule());

        Zoo zoo = injector.getInstance(Zoo.class);

        zoo.addAnimal(new Rabbit(5, 8));  
        zoo.addAnimal(new Tiger(10));    
        zoo.addAnimal(new Wolf(7)); 
        zoo.addInventory(new Table(1));       
        zoo.addInventory(new Computer(2));    

        zoo.listAnimals();
        zoo.listInventory();
        System.out.println("Общее количество еды: " + zoo.calculateTotalFood() + " кг/день.");
    }
}