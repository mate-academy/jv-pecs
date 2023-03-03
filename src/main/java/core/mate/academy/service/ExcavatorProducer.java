package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator(3, 200, 100), new Excavator(2, 290, 40));
    }
}
