package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        Excavator excavator = new Excavator();
        list.add(excavator);
        return list;
    }
}
