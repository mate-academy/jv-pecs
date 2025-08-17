package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Doosan", "yellow", 600));
        excavators.add(new Excavator("John Deere", "red", 847));
        excavators.add(new Excavator("Cat", "yellow-black", 450));
        return excavators;
    }
}
