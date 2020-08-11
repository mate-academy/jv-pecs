package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorMachineProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(40, 1500));
        excavators.add(new Excavator(50, 1800));
        excavators.add(new Excavator(60, 2000));
        return excavators;
    }
}
