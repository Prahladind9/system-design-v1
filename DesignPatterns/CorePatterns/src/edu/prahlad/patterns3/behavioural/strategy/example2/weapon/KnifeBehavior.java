package edu.prahlad.patterns3.behavioural.strategy.example2.weapon;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Cutting with Knife");
    }
}
