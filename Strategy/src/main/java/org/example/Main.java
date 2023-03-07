package org.example;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player(new Gun());
        Player p2 = new Player(new Sward());
        p1.getDamage();
        p2.getDamage();
    }
}