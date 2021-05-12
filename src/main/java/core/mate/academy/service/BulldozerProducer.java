package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("B1", "Grey", 20000));
        bulldozers.add(new Bulldozer("B2", "Purple", 15000));
        bulldozers.add(new Bulldozer("B3", "Black", 17000));
        return bulldozers;
    }
}
