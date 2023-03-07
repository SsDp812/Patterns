package org.example;

public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        IComputer computer = factory.getComputer(ComputerType.PC);
        computer.printScreen();
    }
}
