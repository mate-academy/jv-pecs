package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        Bulldozer bulldozer3 = new Bulldozer();
        List<Bulldozer> listOfBuldozers = new ArrayList<>();
        listOfBuldozers.add(bulldozer1);
        listOfBuldozers.add(bulldozer2);
        listOfBuldozers.add(bulldozer3);
        return listOfBuldozers;
    }
}
