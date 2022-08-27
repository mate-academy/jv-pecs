package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Caterpillar", "blue", "mechanical"));
        bulldozers.add(new Bulldozer("Liebherr", "yellow", "hydrostatic"));
        bulldozers.add(new Bulldozer("Komatsu", "red", "diesel-electric"));
        return bulldozers;
    }
}
