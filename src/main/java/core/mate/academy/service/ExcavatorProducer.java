package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("БОРЕКС 2201", 59.6),
                new Excavator(" JCB JS200W", 64.5));
    }
}
