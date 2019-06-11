package FactoryMethod.sword;

public class SharpedSword implements Sword{

    @Override
    public String name() {
        return "Sharped sword";
    }

    @Override
    public double damage() {
        return 2;
    }
}
