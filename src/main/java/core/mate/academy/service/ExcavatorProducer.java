package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    private final Excavator smallExcavator = new Excavator(2, 5);
    private final Excavator mediumExcavator = new Excavator(4, 10);
    private final Excavator bigExcavator = new Excavator(6, 14);
    private List<Excavator> excavatorList = List.of(smallExcavator, mediumExcavator, bigExcavator);

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
