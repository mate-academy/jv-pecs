package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<? super Machine> get() {
        List<? super Machine> excavators = new ArrayList<>();
        excavators.add(new Excavator());
        excavators.add(new Excavator());
        excavators.add(new Excavator());
        return excavators;
    }
}
