package edu.prahlad.patterns3.behavioural.strategy.example2.character;

import edu.prahlad.patterns3.behavioural.strategy.example2.weapon.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior weapon;

    public abstract void display();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight(){
        weapon.useWeapon();
    }
}
