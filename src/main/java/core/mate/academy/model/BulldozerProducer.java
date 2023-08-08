package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> machines = new ArrayList<>();
        machines.add(new Bulldozer());
        machines.add(new Bulldozer());

        return machines;
    }
}
