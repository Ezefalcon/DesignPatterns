package AbstractFactory.factory;

import AbstractFactory.weapon.Weapon;
import AbstractFactory.weapon.hammers.BrokenHammer;
import AbstractFactory.weapon.hammers.WoodenHammer;
import AbstractFactory.weapon.swords.NewSword;
import AbstractFactory.weapon.swords.RustySword;

public class WeaponFactoryImpl implements WeaponFactory{

    private int level;

    public WeaponFactoryImpl(int level){
        this.level=level;
    }

    @Override
    public Weapon getHammer() {
        if(level==1){
            return new BrokenHammer();
        } else if(level==2){
            return new WoodenHammer();
        } else return null;
    }

    @Override
    public Weapon getSword(){
        if(level==1){
            return new RustySword();
        } else if(level==2){
            return new NewSword();
        } else return null;
    }
}
