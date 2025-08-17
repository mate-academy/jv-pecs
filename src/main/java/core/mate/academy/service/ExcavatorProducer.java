package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List get() {
        return List.of(new Excavator(), new Excavator());
    }
}
