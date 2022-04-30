package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Metal tracks"));
        bulldozers.add(new Bulldozer("Rubber tracks"));
        bulldozers.add(new Bulldozer("Rubber-metal tracks"));
        return bulldozers;
    }
}
