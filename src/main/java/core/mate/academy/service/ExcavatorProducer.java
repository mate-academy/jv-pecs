package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator("Excavator", 300);
        Excavator excavatorTwo = new Excavator("Super Excavator", 500);
        return Arrays.asList(excavatorOne, excavatorTwo);
    }
}
