package Adapter;

import Adapter.swords.Sword;
import Adapter.swords.SwordInterface;

public class Main {
    public static void main(String[] args) {
        Sword e = new Sword();
        System.out.println(e.getDamage());
        SwordInterface a = new Adapter();
        System.out.println(a.getDamage());
    }
}
