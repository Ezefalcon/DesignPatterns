package AbstractFactory;

import AbstractFactory.factory.WeaponFactory;
import AbstractFactory.factory.WeaponFactoryImpl;

public class Main {
    public static void main(String[] args) {
        WeaponFactory w = new WeaponFactoryImpl(2);
        System.out.println(w.getHammer().getDamage()+"sword ="+w.getSword().getDamage());
    }
}
