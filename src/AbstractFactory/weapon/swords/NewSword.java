package AbstractFactory.weapon.swords;

import AbstractFactory.weapon.Weapon;

public class NewSword implements Weapon,Sword {
    @Override
    public double getDamage() {
        return 3;
    }

    @Override
    public double getSpeed() {
        return 1.5;
    }

    @Override
    public double getSharpDamage() {
        return getDamage()*getSpeed();
    }
}
