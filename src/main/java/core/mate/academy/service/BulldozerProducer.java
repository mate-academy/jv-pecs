package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return createBulldozers();
    }

    private List<Bulldozer> createBulldozers() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer1", "Yellow", 10));
        bulldozers.add(new Bulldozer("Bulldozer2", "Red", 8));
        return bulldozers;
    }
}
