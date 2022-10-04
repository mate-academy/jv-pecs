package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator smallExcavator = new Excavator(2, 5);
        Excavator mediumExcavator = new Excavator(4, 10);
        Excavator bigExcavator = new Excavator(6, 14);
        return List.of(smallExcavator, mediumExcavator, bigExcavator);
    }
}
