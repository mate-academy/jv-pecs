package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> excavatorList = List.of(new Excavator(), new Excavator(), new Excavator());
        return excavatorList;
    }
}
