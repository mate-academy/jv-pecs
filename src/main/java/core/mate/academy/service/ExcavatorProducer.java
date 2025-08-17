package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("E-101", "yellow", 120));
        excavators.add(new Excavator("E-102", "blue", 90));
        excavators.add(new Excavator("E-103", "blue", 180));
        return excavators;
    }
}
