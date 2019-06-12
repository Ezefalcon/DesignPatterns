package Strategy;

import Strategy.swords.BrokenSword;
import Strategy.swords.SilverSword;

public class Main {
    public static void main(String[] args) {
        Character c = new Character(12,new SilverSword(12,1));
        Character c2 = new Character(1,new BrokenSword(1,0));

        System.out.println("character ="+ c.getCharacterDamage());
        System.out.println("character 2 ="+ c2.getCharacterDamage());

    }
}
