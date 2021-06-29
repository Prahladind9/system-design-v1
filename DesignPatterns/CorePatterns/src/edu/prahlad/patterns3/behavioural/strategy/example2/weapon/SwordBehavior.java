package edu.prahlad.patterns3.behavioural.strategy.example2.weapon;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword");
    }
}
