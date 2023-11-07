package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Caterpillar", "Yellow", 100));
        bulldozers.add(new Bulldozer("Liebherr", "Blue", 500));
        bulldozers.add(new Bulldozer("Komatsu", "Red", 250));
        return bulldozers;
    }
}
