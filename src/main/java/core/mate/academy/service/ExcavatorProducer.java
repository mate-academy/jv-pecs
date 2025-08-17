package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setName("Excavator1");
        excavator1.setColor("Red");
        excavator1.setArmLength(6);
        excavator1.setBucketCapacity(4.6);
        Excavator excavator2 = new Excavator();
        excavator2.setName("Excavator2");
        excavator2.setColor("Violet");
        excavator2.setArmLength(5);
        excavator2.setBucketCapacity(5.5);
        return List.of(excavator1,excavator2);
    }
}
