package Observer.observer;

public class Server implements ISwordObserver{
    @Override
    public void update() {
        System.out.println("Server: The sword is broken");
    }
}
