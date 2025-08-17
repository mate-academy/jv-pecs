package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setColor("yellow");
        excavator1.setName("excavator1");
        excavator1.setDigHeight(150);
        excavator1.setShovelCapacity(500);
        Excavator excavator2 = new Excavator();
        excavator2.setColor("green");
        excavator2.setName("excavator2");
        excavator2.setDigHeight(200);
        excavator2.setShovelCapacity(300);
        return List.of(excavator1, excavator2);
    }
}
