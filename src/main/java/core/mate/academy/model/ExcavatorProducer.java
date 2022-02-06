package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(99, 20);
        Excavator excavator2 = new Excavator(55, 10);
        Excavator excavator3 = new Excavator(33, 5);
        return List.of(excavator1, excavator2, excavator3);
    }
}
