package org.example;

public class Player implements human {
    Weapon weapon;
    public Player(Weapon weapon){
        this.weapon = weapon;
    }
    @Override
    void getDamage(){
        weapon.atack();
    }
}
