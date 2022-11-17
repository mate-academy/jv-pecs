package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(3, "large"));
        excavators.add(new Excavator(4, "medium"));
        excavators.add(new Excavator(5, "small"));
        return excavators;
    }
}
