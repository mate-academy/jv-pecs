package core.mate.academy.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Ev1", "Yellow", 10));
        excavatorList.add(new Excavator("Ev2", "Red", 15));
        return excavatorList;
    }
}
