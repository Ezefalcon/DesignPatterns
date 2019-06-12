package Strategy.swords;

public class SilverSword extends Sword {

    public SilverSword(double damage, double speed) {
        super(damage, speed);
    }

    @Override
    public double getDamage() {
        return this.damage*2;
    }

    @Override
    public double getSpeed() {
        return this.speed+5;
    }
}
