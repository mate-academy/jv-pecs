package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("Boom type 1", 5, 2),
                new Excavator("Boom type 2", 10, 5),
                new Excavator("Boom type 3", 15, 7));
    }
}
