package Composite.swords;

public class Sword extends AbstractSword {

    @Override
    public double getDamage() {
        return this.damage;
    }

    public Sword(double damage) {
        this.damage = damage;
    }
}
