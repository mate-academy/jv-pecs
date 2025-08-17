package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(300, 2000, "black"));
        excavators.add(new Excavator(280, 1800, "blue"));
        excavators.add(new Excavator(330, 2500, "white"));
        return excavators;
    }
}
