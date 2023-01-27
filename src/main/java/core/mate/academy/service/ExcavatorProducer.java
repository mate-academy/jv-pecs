package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Boom type 1", 5, 2));
        excavators.add(new Excavator("Boom type 2", 10, 5));
        excavators.add(new Excavator("Boom type 3", 15, 7));
        return excavators;
    }
}
