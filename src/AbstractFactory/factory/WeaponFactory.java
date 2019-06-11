package AbstractFactory.factory;

import AbstractFactory.weapon.Weapon;

public interface WeaponFactory {
    Weapon getSword();
    Weapon getHammer();
}
