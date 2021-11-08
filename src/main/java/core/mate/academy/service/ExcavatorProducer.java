package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<? extends Machine> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(4.6, true, false,
                "Excavator1", "Green"));
        excavators.add(new Excavator(7.0, false, true,
                "Excavator2", "Yellow"));
        excavators.add(new Excavator(4.78, false, false,
                "Excavator3", "White"));
        return excavators;
    }
}
