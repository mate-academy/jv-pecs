package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator_One", "white", 111.5));
        excavators.add(new Excavator("Excavator_Two", "yellow", 222.5));
        excavators.add(new Excavator("Excavator_Three", "green", 333.5));
        return excavators;
    }
}
