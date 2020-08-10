package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator(1500, "USA");
        excavator.setColor("yellow");
        excavator.setName("Caterpillar");
        Excavator excavator1 = new Excavator(1650, "Netherlands");
        excavator1.setName("John Deere");
        excavator1.setColor("black");
        return List.of(excavator1, excavator);
    }
}
