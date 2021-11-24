package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("JCB", "Orange", 0.5));
        excavators.add(new Excavator("Volvo", "Yellow", 1.1));
        excavators.add(new Excavator("Hyundai", "Orange", 0.3));
        excavators.add(new Excavator("Sany", "Orange", 1.3));
        return excavators;
    }
}
