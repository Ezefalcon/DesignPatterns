package Strategy.swords;

public class WoodenSword  extends Sword {

    public WoodenSword(double damage, double speed) {
        super(damage, speed);
    }

    @Override
    public double getDamage() {
        return this.damage+1;
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }
}
