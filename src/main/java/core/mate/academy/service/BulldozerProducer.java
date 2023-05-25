package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer();
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        List<Bulldozer> listToReturn = new ArrayList<>();
        listToReturn.add(bulldozer);
        listToReturn.add(bulldozer1);
        listToReturn.add(bulldozer2);
        return listToReturn;
    }
}
