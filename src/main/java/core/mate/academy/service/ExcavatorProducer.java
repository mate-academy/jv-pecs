package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("CASE", "Green", 150));
        excavators.add(new Excavator("Doosan", "Red", 300));
        excavators.add(new Excavator("Hitachi", "White", 200));
        return excavators;
    }
}
