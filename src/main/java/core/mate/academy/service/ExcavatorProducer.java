package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("I", 1234, 500);
        Excavator excavator2 = new Excavator("I", 5678, 500);
        Excavator excavator3 = new Excavator("I", 9765, 500);
        return List.of(excavator1, excavator2, excavator3);
    }
}
