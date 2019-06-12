package Observer.observable;

import Observer.observer.ISwordObserver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sword implements ISwordObservable{

    private Set<ISwordObserver> swordObservers;
    private double damage;
    private double durability;

    public Sword(double damage, double durability) {
        this.swordObservers= new HashSet<>();
        this.damage = damage;
        this.durability = durability;
    }

    public double getDamage() {
        return damage;
    }

    public boolean isBroken(){
        return durability<=0;
    }

    public double getDurability() {
        return durability;
    }

    public void useSword(){
        this.durability=-10;
        if(isBroken()){
            notifyObservers();
        }
    }

    @Override
    public void add(ISwordObserver obs) {
        this.swordObservers.add(obs);
    }

    @Override
    public void remove(ISwordObservable obs) {
        this.swordObservers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(ISwordObserver i:swordObservers){
            i.update();
        }
    }


}
