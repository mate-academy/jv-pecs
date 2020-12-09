package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    List<Machine> list = List.of(new Excavator(), new Excavator());

    @Override
    public List<Machine> get() {
        return list;
    }
}
