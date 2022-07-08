package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("excsvator4", 4));
        excavators.add(new Excavator("excavator5", 5));
        excavators.add(new Excavator("excavator6", 6));
        return excavators;
    }
}
