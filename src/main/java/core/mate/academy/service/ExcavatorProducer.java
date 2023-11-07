package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Case", "yellow", 1000, 10));
        excavators.add(new Excavator("Komatsu", "black", 1500, 8));
        return excavators;
    }
}
