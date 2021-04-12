package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<T extends Excavator> implements MachineProducer<T> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Shantui", "black", 5.1));
        excavators.add(new Excavator("Caterpillar", "yellow", 4.3));
        excavators.add(new Excavator("Shehwa", "green", 3.1));
        return excavators;
    }
}
