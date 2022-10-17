package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("5CX", "yellow", 88, 2));
        excavators.add(new Excavator("3CX", "green", 90, 3));
        excavators.add(new Excavator("2CX", "blue", 85, 4));
        return excavators;
    }
}
