package Strategy.swords;

public class BrokenSword extends Sword {

    public BrokenSword(double damage, double speed) {
        super(damage, speed);
    }

    @Override
    public double getDamage() {
        return this.damage;
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }
}
