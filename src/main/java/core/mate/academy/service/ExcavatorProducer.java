package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(120, 13250.5);
        Excavator excavator2 = new Excavator(100, 15532.8);
        Excavator excavator3 = new Excavator(95, 17569.0);
        return Arrays.asList(excavator1, excavator2, excavator3);
    }
}
