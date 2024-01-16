package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Crawler", 2.5, 10.5));
        excavators.add(new Excavator("Wheel", 1.8, 8.0));
        excavators.add(new Excavator("Compact", 1.2, 6.5));
        return excavators;
    }
}
