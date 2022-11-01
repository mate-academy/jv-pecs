package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        final Excavator excavator1 = new Excavator();
        final Excavator excavator2 = new Excavator();
        final Excavator excavator3 = new Excavator();
        return List.of(excavator1, excavator2, excavator3);
    }
}
