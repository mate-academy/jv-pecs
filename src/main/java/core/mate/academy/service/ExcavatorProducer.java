package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setOwner("Mike");
        excavator1.setMileage(9000);
        Excavator excavator2 = new Excavator();
        excavator2.setOwner("Sam");
        excavator2.setMileage(4200);
        Excavator excavator3 = new Excavator();
        excavator3.setOwner("Monica");
        excavator3.setMileage(3600);
        List<Excavator> newExcavators = new ArrayList<>();
        newExcavators.add(excavator1);
        newExcavators.add(excavator2);
        newExcavators.add(excavator3);

        return newExcavators;
    }
}
