package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("CAT", "green", 13));
        excavators.add(new Excavator("Link-Belt", "blue", 1500));
        excavators.add(new Excavator("Terex", "indigo", 4500));
        return excavators;

    }
}
