package AbstractFactory.weapon.swords;

import AbstractFactory.weapon.Weapon;

public class RustySword implements Weapon,Sword {

    @Override
    public double getDamage() {
        return 2;
    }

    @Override
    public double getSpeed() {
        return 1.2;
    }

    @Override
    public double getSharpDamage() {
        return getDamage()*getSpeed();
    }
}
