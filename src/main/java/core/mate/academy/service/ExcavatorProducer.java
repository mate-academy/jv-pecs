package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("I", 1234, 500),
                       new Excavator("I", 5678, 500),
                       new Excavator("I", 9765, 500));
    }
}
