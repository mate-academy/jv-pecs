package core.mate.academy.service;

import java.util.List;
import core.mate.academy.model.Excavator;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("black", 1200),
                new Excavator("yellow", 560));
    }
}
