package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        Excavator excavator3 = new Excavator();

        excavator1.setName("Excavator 1");
        excavator1.setColor("Blue");
        excavator1.setBucketCapacity(300);
        excavator1.setMaxSpeed(100);
        excavator1.setUndercarriageType("Type 1");

        excavator2.setName("Excavator 2");
        excavator2.setColor("Yellow");
        excavator2.setBucketCapacity(200);
        excavator2.setMaxSpeed(120);
        excavator2.setUndercarriageType("Type 2");

        excavator3.setName("Excavator 3");
        excavator3.setColor("Orange");
        excavator3.setBucketCapacity(400);
        excavator3.setMaxSpeed(150);
        excavator3.setUndercarriageType("Type 3");

        List<Excavator> excavatorList = new ArrayList<>();

        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        excavatorList.add(excavator3);

        return  excavatorList;
    }
}
