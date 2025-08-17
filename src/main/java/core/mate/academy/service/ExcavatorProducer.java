package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator1", "Black", 300));
        excavators.add(new Excavator("Excavator2", "Yellow", 250));
        excavators.add(new Excavator("Excavator3", "Grey", 200));
        return excavators;
    }
}
