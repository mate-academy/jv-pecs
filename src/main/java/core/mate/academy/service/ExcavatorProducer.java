package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("JCB 3CX", "orange", 60));
        excavators.add(new Excavator("JCB 4CX", "black", 90));
        return excavators;
    }
}
