package FactoryMethod.swordFactory;

import FactoryMethod.sword.Sword;

public class Main{
    public static void main(String[] args) {
        Sword s = SwordFactory.getSword(1);
        System.out.println(s.damage());
    }
}
