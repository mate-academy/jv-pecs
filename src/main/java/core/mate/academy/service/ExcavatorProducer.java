package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setBucketCapacity(10);

        Excavator excavator2 = new Excavator();
        excavator2.setBucketCapacity(15);

        return Arrays.asList(excavator1, excavator2);
    }
}
