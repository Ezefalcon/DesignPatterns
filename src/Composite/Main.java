package Composite;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ALotOfSwords f = new ALotOfSwords();
        f.add(new Sword(1));
        f.add(new Sword(1));
        ALotOfSwords a = new ALotOfSwords();
        a.add(f);
        a.add(new Sword(1));
        System.out.println(a.getDamage());
    }
}
