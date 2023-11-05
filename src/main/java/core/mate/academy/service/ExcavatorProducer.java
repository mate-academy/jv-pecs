package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("excavator", "black", 1100),
                new Excavator("excavator1", "grey", 1000),
                new Excavator("excavator2", "brown", 1300));
    }
}
