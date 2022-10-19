package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setBucketCapacity(0.65);
        excavator1.setTypeOfWork("mining");
        excavator1.setColor("white");
        excavator1.setName("first excavator");
        Excavator excavator2 = new Excavator();
        excavator2.setBucketCapacity(10.0);
        excavator2.setTypeOfWork("building");
        excavator2.setColor("orange");
        excavator2.setName("second excavator");
        return List.of(excavator1, excavator2);
    }
}
