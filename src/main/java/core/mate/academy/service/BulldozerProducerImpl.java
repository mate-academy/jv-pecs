package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Machine> {
    @Override
    public List<Machine> get(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        Bulldozer bulldozerOne = new Bulldozer();
        Bulldozer bulldozerTwo = new Bulldozer();

        machines.add(bulldozerOne);
        machines.add(bulldozerTwo);
        return machines;
    }
}
