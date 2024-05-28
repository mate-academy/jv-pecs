package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        bulldozers.add(new Bulldozer("Komatsu", "Bulldozer - 1", "Yellow"));
        bulldozers.add(new Bulldozer("Caterpillar", "Bulldozer - 2", "White"));
        bulldozers.add(new Bulldozer("Liebherr", "Bulldozer - 3", "Blu"));

        return bulldozers;
    }
}
