package AbstractFactory.weapon.hammers;

import AbstractFactory.weapon.Weapon;

public class WoodenHammer implements Weapon {

    @Override
    public double getDamage() {
        return 6;
    }

    @Override
    public double getSpeed() {
        return 0.2;
    }
}
