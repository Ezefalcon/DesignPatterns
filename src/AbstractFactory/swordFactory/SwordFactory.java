package AbstractFactory.swordFactory;

import AbstractFactory.sword.RustySword;
import AbstractFactory.sword.SharpedSword;
import AbstractFactory.sword.Sword;

public class SwordFactory {
    public static Sword getSword(int level){
        if(level==1){
            return new RustySword();
        } else if(level==2){
            return new SharpedSword();
        }
        return null;
    }
}
