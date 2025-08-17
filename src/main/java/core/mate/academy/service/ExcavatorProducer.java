package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Mercedes", "White", 11, 3, 17));
        excavators.add(new Excavator("Audi", "Green", 9, 3, 19));
        excavators.add(new Excavator("Mercedes", "White", 5, 5, 178));
        return excavators;
    }
}
