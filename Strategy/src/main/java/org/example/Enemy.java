package org.example;

public class Enemy implements human{
    Weapon weapon;
    public Enemy(Weapon weapon){
        this.weapon = weapon;
    }
    void getDamage(){
        weapon.atack();
    }
}
