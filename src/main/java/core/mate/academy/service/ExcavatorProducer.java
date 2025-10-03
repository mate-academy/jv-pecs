package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("CAT", "Orange", 550.0, 250.0, 375.0));
        excavators.add(new Excavator("CAT2", "Black", 850.0, 440.0, 775.0));
        return excavators;
    }
}
