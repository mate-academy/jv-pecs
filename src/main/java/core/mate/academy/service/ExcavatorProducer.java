package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator(4.6, true, false, "Excavator1", "Green"),
                new Excavator(7.0, false, true, "Excavator2", "Yellow"),
                new Excavator(4.78, false, false, "Excavator3", "White"));
    }
}
