package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Bulldozer1", "black", 2200);
        Bulldozer bulldozer2 = new Bulldozer("Bulldozer2", "white", 1300);
        Bulldozer bulldozer3 = new Bulldozer("Bulldozer3", "yellow", 1900);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
