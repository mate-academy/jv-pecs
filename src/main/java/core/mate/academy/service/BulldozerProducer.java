package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Heavy", "Flat", 5.3, 2.0));
        bulldozers.add(new Bulldozer("Light", "Landscaping", 1.5, 1.0));
        bulldozers.add(new Bulldozer("Medium", "Universal", 2.5, 1.5));
        return bulldozers;
    }
}
