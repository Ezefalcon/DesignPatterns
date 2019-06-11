package AbstractFactory.weapon.hammers;

import AbstractFactory.weapon.Weapon;

public class BrokenHammer implements Weapon {
    @Override
    public double getDamage() {
        return 2.5;
    }

    @Override
    public double getSpeed() {
        return 0.5;
    }
}
