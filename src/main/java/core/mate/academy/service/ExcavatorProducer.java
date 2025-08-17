package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List get() {
        List<Excavator> machine = new ArrayList<>();
        machine.add(new Excavator());
        return machine;
    }
}
