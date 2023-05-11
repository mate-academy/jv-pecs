package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator1", "Blue", 22));
        excavators.add(new Excavator("Excavator2", "Yellow", 12));
        excavators.add(new Excavator("Excavator3", "Orange", 15));
        return excavators;
    }
}
