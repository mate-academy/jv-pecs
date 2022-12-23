package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> machines = new ArrayList<>();
        machines.add(new Bulldozer("Buldozer1", "Yellow"));
        machines.add(new Bulldozer("Buldozer2", "White"));
        machines.add(new Bulldozer("Buldozer3", "Blue"));
        return machines;
    }
}
