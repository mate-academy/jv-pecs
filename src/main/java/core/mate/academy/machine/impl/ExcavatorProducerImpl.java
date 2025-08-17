package core.mate.academy.machine.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();

        excavatorList.add(new Excavator("Excavator1", "Red", 1));
        excavatorList.add(new Excavator("Excavator2", "White", 2));
        excavatorList.add(new Excavator("Excavator3", "Black", 3));
        excavatorList.add(new Excavator("Excavator4", "Orange", 4));
        excavatorList.add(new Excavator("Excavator5", "Green", 5));

        return excavatorList;
    }
}
