package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Machine> get() {
        List<Machine> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer1", "Green", "MAN", 5_000_000));
        bulldozers.add(new Bulldozer("Bulldozer2", "Yellow", "MAN", 4_000_000));
        return bulldozers;
    }
}
