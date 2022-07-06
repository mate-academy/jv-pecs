package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("bulldozer1", 1));
        bulldozers.add(new Bulldozer("bulldozer2", 2));
        bulldozers.add(new Bulldozer("bulldozer3", 3));
        return bulldozers ;
    }
}
