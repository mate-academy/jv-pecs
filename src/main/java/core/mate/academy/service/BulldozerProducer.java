package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer1", "black", 10));
        bulldozers.add(new Bulldozer("Bulldozer2", "grey", 15));
        bulldozers.add(new Bulldozer("Bulldozer3", "white", 20));

        return bulldozers;
    }
}
