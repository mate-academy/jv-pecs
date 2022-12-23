package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List get() {
        Excavator excavator = new Excavator();
        Excavator excavator1 = new Excavator();
        return Arrays.asList(excavator, excavator1);
    }
}
