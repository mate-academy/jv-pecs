package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Caterpillar", "Yellow", 2));
        bulldozers.add(new Bulldozer("Liebherr", "White", 3));
        bulldozers.add(new Bulldozer("Komatsu", "Yellow", 3));
        return bulldozers;
    }
}
