package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(50, 250);
        Excavator excavator2 = new Excavator(78, 500);
        Excavator excavator3 = new Excavator(100, 750);
        return Arrays.asList(excavator1, excavator2, excavator3);
    }
}
