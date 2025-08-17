package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavators = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        fillListOfExcavator();
        return excavators;
    }

    private void fillListOfExcavator() {
        excavators.add(new Excavator("Ex1", "white",
                5, 10));
        excavators.add(new Excavator("Ex2", "Green",
                6, 11));
    }
}
