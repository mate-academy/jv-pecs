package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator8 = new Excavator(167, 24.6);
        Excavator excavator16 = new Excavator(271, 37.3);
        Excavator excavator32 = new Excavator(420, 51.2);
        return Arrays.asList(excavator8, excavator16, excavator32);
    }
}
