package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavatozavr", " Orange", 1000));
        excavators.add(new Excavator("Tor", " black", 500));
        excavators.add(new Excavator("Shrek", "Green", 100));
        return excavators;
    }
}
