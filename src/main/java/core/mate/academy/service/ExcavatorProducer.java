package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        List<Machine> excavator = new ArrayList<>();
        excavator.add(new Excavator());
        return excavator;
    }
}
