package com.example.record;

public record Car(String make, int capacity) {
    public Car {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity can't be negative!");
        }
    }
}