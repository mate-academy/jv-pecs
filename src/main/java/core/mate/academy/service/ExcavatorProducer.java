package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(200, "Cat", "Orange"));
        excavators.add(new Excavator(150, "JCB", "Yellow"));
        excavators.add(new Excavator(170, "Komatsu", "Brown"));
        return excavators;
    }
}
