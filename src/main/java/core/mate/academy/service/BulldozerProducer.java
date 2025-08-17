package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer First", "White", 100, 150));
        bulldozers.add(new Bulldozer("Bulldozer Second", "Yellow", 110, 150));
        bulldozers.add(new Bulldozer("Bulldozer Third", "Green", 120, 150));
        return bulldozers;
    }
}
