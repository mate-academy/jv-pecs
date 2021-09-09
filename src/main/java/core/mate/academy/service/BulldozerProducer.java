package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("red", "bulldozer1"));
        bulldozers.add(new Bulldozer("green", "bulldozer2"));
        bulldozers.add(new Bulldozer("yellow", "bulldozer3"));
        return bulldozers;
    }
}
