package com.example;

public class VeterinaryClinic {
    public boolean checkHealth(IAlive animal) {
        boolean isHealthy = Math.random() > 0.2;
        System.out.println("Проверка здоровья животного: " + (isHealthy ? "здорово" : "нездорово"));
        return isHealthy;
    }
}
