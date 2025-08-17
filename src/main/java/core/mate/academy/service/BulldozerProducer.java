package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers;

    public BulldozerProducer() {
        bulldozers = new ArrayList<>();
    }

    @Override
    public List<Bulldozer> get() {
        bulldozers.add(Bulldozer.of(6000, 5));
        bulldozers.add(Bulldozer.of(8500, 11));
        return bulldozers;
    }
}
