package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("One", "White", 2.5, 2));
        excavators.add(new Excavator("Two", "Black", 3, 1));
        excavators.add(new Excavator("Three", "Cyan", 5.5, 2));
        return excavators;
    }
}
