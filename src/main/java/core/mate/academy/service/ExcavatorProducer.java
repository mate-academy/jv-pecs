package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator("bmw", 3000);
        Excavator excavatorTwo = new Excavator("toyota", 5000);
        return Arrays.asList(excavatorOne, excavatorTwo);
    }
}
