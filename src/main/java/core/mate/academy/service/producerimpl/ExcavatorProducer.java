package core.mate.academy.service.producerimpl;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    Excavator excavator1 = new Excavator();
    Excavator excavator2 = new Excavator();
    Excavator excavator3 = new Excavator();
    List<Machine> excavators = new ArrayList<>();

    @Override
    public List<Machine> get() {
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
