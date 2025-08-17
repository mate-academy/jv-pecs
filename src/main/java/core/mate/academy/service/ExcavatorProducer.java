package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("first", "green", 50));
        excavators.add(new Excavator("second", "brown", 40));
        excavators.add(new Excavator("last", "blue", 70));
        return excavators;
    }
}
