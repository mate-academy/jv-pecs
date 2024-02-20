package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List get() {
        return List.of(new Excavator(),
                new Excavator(),
                new Excavator());
    }
}
