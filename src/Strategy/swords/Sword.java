package Strategy.swords;

public abstract class Sword {

    protected double damage;
    protected double speed;

    public Sword(double damage, double speed) {
        this.damage = damage;
        this.speed = speed;
    }

    public abstract double getDamage();
    public abstract double getSpeed();
}
