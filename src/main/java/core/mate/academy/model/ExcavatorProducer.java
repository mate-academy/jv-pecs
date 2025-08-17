package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("jcb", "yekllow", 45.5, 15.3);
        Excavator excavator2 = new Excavator("john deere", "green", 35.6, 10.1);
        return List.of(excavator1, excavator2);
    }
}
