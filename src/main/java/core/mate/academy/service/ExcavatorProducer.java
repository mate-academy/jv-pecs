package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator - 1", "Red",5.2));
        excavators.add(new Excavator("Excavator - 2", "Red", 4.2));
        excavators.add(new Excavator("Excavator - 3", "Green", 3.2));

        return excavators;
    }
}
