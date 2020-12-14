package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        list.add(new Excavator());
        list.add(new Excavator());
        list.add(new Excavator());
        return list;
    }
}
