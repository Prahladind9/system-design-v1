package edu.prahlad.patterns3.behavioural.strategy.example2;

import edu.prahlad.patterns3.behavioural.strategy.example2.character.Character;
import edu.prahlad.patterns3.behavioural.strategy.example2.character.King;
import edu.prahlad.patterns3.behavioural.strategy.example2.weapon.SwordBehavior;

public class Main {
    public static void main(String[] args) {
        Character character = new King();
        character.setWeapon(new SwordBehavior());
        character.display();
        character.fight();
    }
}
