package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Excavator excavatorOne = new Excavator();
        Excavator excavatorTwo = new Excavator();
        Excavator excavatorThree = new Excavator();
        return List.of(excavatorOne, excavatorTwo, excavatorThree);
    }
}
