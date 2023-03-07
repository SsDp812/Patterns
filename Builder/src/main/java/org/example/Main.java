package org.example;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilderImpl();
        builder.setName("Audi");
        builder.setFuel(40.0);
        Car car = builder.build();
        car.printInfo();
        builder.setSpeed(320);
        builder.setYear(2016);
        car = builder.build();
        car.printInfo();
    }
}