package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Machine> get() {
        return List.of(new Excavator("Standard bucket"), new Excavator("Heavy bucket"),
                new Excavator("Loading bucket"));
    }
}
