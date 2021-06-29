package edu.prahlad.patterns3.behavioural.strategy.example2.weapon;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Chopping with axe");
    }
}
