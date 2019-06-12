package Adapter;

import Adapter.swords.GiantSword;
import Adapter.swords.SwordInterface;

public class Adapter implements SwordInterface {
    GiantSword giantSword;

    public Adapter(){
        giantSword= new GiantSword();
    }

    @Override
    public double getDamage() {
        return giantSword.getFullDamage();
    }
}
