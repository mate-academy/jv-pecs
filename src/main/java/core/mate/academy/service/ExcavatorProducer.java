package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return Arrays.asList(new Excavator("Excavator1", "white"),
                new Excavator("Excavator2", "yellow"),
                new Excavator("Excavator3", "green"));
    }
}
