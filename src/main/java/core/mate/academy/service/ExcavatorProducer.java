package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Lonking", "Red", 1.6));
        excavators.add(new Excavator("Caterpillar", "Yellow", 1));
        excavators.add(new Excavator("Volvo", "Black", 2.8));
        return excavators;
    }
}
