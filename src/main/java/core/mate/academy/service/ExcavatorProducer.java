package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> machines = new ArrayList<>();
        machines.add(new Excavator("Excavator1", "Orange"));
        machines.add(new Excavator("Excavator2", "Green"));
        machines.add(new Excavator("Excavator3", "Grey"));
        return machines;
    }
}
