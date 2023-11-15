package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    ExcavatorProducer() {

    }

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(34, 45, "Standard"));
        excavators.add(new Excavator(33, 44, "Wheeled"));
        excavators.add(new Excavator(66, 90, "Hydraulc"));
        return excavators;
    }
}
