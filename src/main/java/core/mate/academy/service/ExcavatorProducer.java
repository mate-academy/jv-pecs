package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("HUNDAY", "black", 1.5));
        excavators.add(new Excavator("TOYOTA", "red", 2.7));
        return excavators;
    }
}
