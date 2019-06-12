package Observer.observable;

import Observer.observer.ISwordObserver;

public interface ISwordObservable {
    void add(ISwordObserver obs);
    void remove(ISwordObservable obs);
    void notifyObservers();
}
