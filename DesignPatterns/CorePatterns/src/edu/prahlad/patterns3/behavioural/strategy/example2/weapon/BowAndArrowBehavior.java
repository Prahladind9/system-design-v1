package edu.prahlad.patterns3.behavioural.strategy.example2.weapon;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("shooting an arrow with a bow");
    }
}
