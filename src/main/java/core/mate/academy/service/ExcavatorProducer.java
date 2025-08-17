package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(500, "diesel"));
        excavators.add(new Excavator(400, "diesel"));
        excavators.add(new Excavator(600, "petrol"));
        return excavators;
    }
}
