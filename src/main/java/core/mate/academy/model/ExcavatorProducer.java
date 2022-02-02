package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> getListMachines() {
        return List.of(new Excavator(4),
                new Excavator(2),
                new Excavator(6));
    }
}
