package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        Excavator excavator1 = new Excavator();

        excavator1.setName("Excavator 1");
        excavator1.setColor("Blue");
        excavator1.setBucketCapacity(300);
        excavator1.setMaxSpeed(100);
        excavator1.setUndercarriageType("Type 1");

        Excavator excavator2 = new Excavator();

        excavator2.setName("Excavator 2");
        excavator2.setColor("Yellow");
        excavator2.setBucketCapacity(200);
        excavator2.setMaxSpeed(120);
        excavator2.setUndercarriageType("Type 2");

        Excavator excavator3 = new Excavator();

        excavator3.setName("Excavator 3");
        excavator3.setColor("Orange");
        excavator3.setBucketCapacity(400);
        excavator3.setMaxSpeed(150);
        excavator3.setUndercarriageType("Type 3");

        List<Machine> excavatorList = List.of(excavator1, excavator2, excavator3);

        return excavatorList;
    }
}
