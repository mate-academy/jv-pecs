package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Volvo", "red", 15));
        excavators.add(new Excavator("Mercedes", "green", 10));
        excavators.add(new Excavator("Caterpillar", "blue", 12.5));
        return excavators;
    }
}
