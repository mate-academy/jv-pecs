package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("exc1", "Red", 500);
        Excavator excavator2 = new Excavator("exc2", "Black", 1000);
        Excavator excavator3 = new Excavator("exc3", "Green", 100);
        return List.of(excavator1, excavator2, excavator3);
    }
}
