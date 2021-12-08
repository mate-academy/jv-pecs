package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozers.add(bulldozer1);
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozers.add(bulldozer2);
        Bulldozer bulldozer3 = new Bulldozer();
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
