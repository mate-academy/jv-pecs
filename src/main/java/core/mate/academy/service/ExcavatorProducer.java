package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator mediumExcavator = new Excavator(6.7, 273, 440);
        Excavator largeExcavator = new Excavator(7.7, 424, 860);
        Excavator longReachExcavator = new Excavator(13, 311, 720);
        return List.of(mediumExcavator, largeExcavator, longReachExcavator);
    }
}
