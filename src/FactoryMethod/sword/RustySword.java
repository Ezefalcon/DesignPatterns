package FactoryMethod.sword;

public class RustySword implements Sword {
    @Override
    public String name() {
        return "Rusty sword";
    }

    @Override
    public double damage() {
        return 1.5;
    }
}
