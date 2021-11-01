package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;

import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        Excavator excavator1 = new Excavator("Excavator 1", "blue", 2020);
        Excavator excavator2 = new Excavator("Excavator 2", "white", 2010);
        Excavator excavator3 = new Excavator("Excavator 3", "orange", 2011);
        return List.of(excavator1, excavator2, excavator3);
    }
}
