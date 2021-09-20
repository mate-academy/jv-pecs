package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        List<Machine> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer("Komatsu", "yellow"));
        bulldozers.add(new Bulldozer("Caterpillar", "white"));
        bulldozers.add(new Bulldozer("John Deere", "green"));
        return bulldozers;
    }
}
