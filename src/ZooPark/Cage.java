package ZooPark;

import java.util.ArrayList;
import java.util.List;

public class Cage {

    List<Animal> resultP = new ArrayList<Animal>();

    List<Animal> resultH = new ArrayList<Animal>();

    public void putAnimalP(Animal a) {

        this.resultP.add(a);

    }

    public void putAnimalH(Animal a) {

        this.resultH.add(a);

    }


}
