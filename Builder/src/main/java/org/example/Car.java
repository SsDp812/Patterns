package org.example;

public class Car {
    String name;
    int year;
    double fuel;
    int speed;

    public void printInfo(){
        if(name!=null){
            System.out.println(name);
        }
        if(year!=0){
            System.out.println(year);
        }
        if(fuel != 0){
            System.out.println(fuel);
        }
        if(speed != 0){
            System.out.println(speed);
        }

    }
}
