package Composite;

import java.util.ArrayList;
import java.util.List;

public class ALotOfSwords extends AbstractSword{

    List<AbstractSword> swordList;

    @Override
    public double getDamage() {
        double total=0;
        for (AbstractSword s : swordList) {
            total += s.getDamage();
        }
        return total;
    }

    public ALotOfSwords(){
        swordList=new ArrayList();
    }

    public void add(AbstractSword e){
        swordList.add(e);
    }
}
