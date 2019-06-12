package Strategy;

import Strategy.swords.Sword;

public class Character {
    double health;
    Sword sword;

    public Character(double health, Sword sword) {
        this.health = health;
        this.sword = sword;
    }

    public double getCharacterDamage(){
        return sword.getDamage();
    }
}
