package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("EX1", "red", 10, 10);
        Excavator excavator2 = new Excavator("EX2", "green", 20, 20);
        Excavator excavator3 = new Excavator("EX3", "blue", 30, 30);
        return List.of(excavator1, excavator2, excavator3);
    }
}
