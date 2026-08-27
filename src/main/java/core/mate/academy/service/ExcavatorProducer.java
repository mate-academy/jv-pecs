package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<? extends Machine> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(1, 2, 3));
        excavators.add(new Excavator(4, 5, 6));
        return excavators;
    }
}
