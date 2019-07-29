package FactoryMethod.swordFactory;

import FactoryMethod.sword.RustySword;
import FactoryMethod.sword.SharpedSword;
import FactoryMethod.sword.Sword;

//As singleton
public class SwordFactory{

    private static SwordFactory INSTANCE;

    private SwordFactory(){}

    public static SwordFactory getInstance(){
        if(INSTANCE==null){
            INSTANCE = new SwordFactory();
        }
        return INSTANCE;
    }

    public static Sword getSword(int level){
        if(level==1){
            return new RustySword();
        } else if(level==2){
            return new SharpedSword();
        }
        return null;
    }
}
