package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerMachineProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(50, "low"));
        bulldozers.add(new Bulldozer(100, "middle"));
        bulldozers.add(new Bulldozer(150, "high"));
        return bulldozers;
    }
}
