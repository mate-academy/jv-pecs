package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("bulldozer1", "red", "brend1", 1000));
        bulldozers.add(new Bulldozer("bulldozer2", "black", "brend2", 2000));
        return bulldozers;
    }
}
