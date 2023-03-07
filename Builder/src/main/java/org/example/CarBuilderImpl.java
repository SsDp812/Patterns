package org.example;

public class CarBuilderImpl implements CarBuilder{
    Car car = new Car();
    @Override
    public CarBuilder setName(String name) {
        car.name = name;
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
    car.year = year;
        return this;
    }

    @Override
    public CarBuilder setFuel(double fuel) {
        car.fuel = fuel;
        return this;
    }

    @Override
    public CarBuilder setSpeed(int speed) {
        car.speed = speed;
        return this;
    }
    public  Car build(){
        return car;
    }
}
