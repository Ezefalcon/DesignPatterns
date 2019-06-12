package Observer.observer;

public class Character implements ISwordObserver {

    private double health;

    @Override
    public void update() {
        System.out.println("Character: The sword is broken");
    }
}
