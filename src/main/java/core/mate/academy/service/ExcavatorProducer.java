package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator excavator = new Excavator();
        for (int i = 0; i < 3; i++) {
            excavators.add(excavator);
        }
        return excavators;
    }
}
