package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return excavatorList;
    }

    private Excavator smallExcavator = new Excavator(2, 5);
    private Excavator mediumExcavator = new Excavator(4, 10);
    private Excavator bigExcavator = new Excavator(6, 14);
    List<Excavator> excavatorList = List.of(smallExcavator, mediumExcavator, bigExcavator);
}
