package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(100, 20, "FirstExcavator", "Yellow"));
        excavators.add(new Excavator(150, 30, "SecondExcavator", "Red"));
        excavators.add(new Excavator(500, 75, "ThirdExcavator", "Green"));
        return excavators;
    }
}
