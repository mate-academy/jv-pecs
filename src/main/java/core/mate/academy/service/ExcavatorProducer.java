package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return Arrays.asList(
                new Excavator("Excavator1", "Blue", 1.2, 4.0),
                new Excavator("Excavator2", "Blue", 1.5, 4.5)
        );
    }
}
