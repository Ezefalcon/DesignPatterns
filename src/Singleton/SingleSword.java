package Singleton;

public class SingleSword {
    private final static SingleSword INSTANCE=new SingleSword();

    private SingleSword(){}

    public SingleSword getInstance(){
        return INSTANCE;
    }
}
