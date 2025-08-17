package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("red", 55, 2000));
        excavators.add(new Excavator("blue", 97, 2500));
        excavators.add(new Excavator("green", 88, 2750));
        return excavators;
    }
}
