package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        return List.of(new Excavator("maker1", 1), new Excavator("maker1", 2),
                new Excavator("maker1", 3));
    }
}
