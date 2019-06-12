package Observer;

import Observer.observable.ISwordObservable;
import Observer.observable.Sword;
import Observer.observer.Character;
import Observer.observer.ISwordObserver;
import Observer.observer.Server;

public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword(12,1);
        ISwordObserver character= new Character();
        ISwordObserver server = new Server();

        sword.add(character);
        sword.add(server);
        sword.useSword();

    }
}
