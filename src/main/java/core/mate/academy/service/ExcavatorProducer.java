package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("excavator1", "blue", 10);
        Excavator excavator2 = new Excavator("excavator2", "orange", 12);
        Excavator excavator3 = new Excavator("excavator3", "brown", 15);
        return List.of(excavator1, excavator2, excavator3);
    }
}
