package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Volvo", "Pink", "Crawler", "Continuous", 2));
        excavators.add(new Excavator("Toyota", "Yellow", "Crawler", "Continuous", 2));
        excavators.add(new Excavator("Renault", "Blue", "Crawler", "Continuous", 2));
        return excavators;
    }
}
