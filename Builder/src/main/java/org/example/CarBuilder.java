package org.example;

public interface CarBuilder {
    CarBuilder setName(String name);
    CarBuilder setYear(int year);
    CarBuilder setFuel(double fuel);
    CarBuilder setSpeed(int speed);
    Car build();
}
