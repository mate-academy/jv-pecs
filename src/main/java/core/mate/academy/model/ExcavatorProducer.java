package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator();
        excavatorOne.setBucketWeight(10);
        excavatorOne.setName("TMR");
        excavatorOne.setColor("green");
        Excavator excavatorTwo = new Excavator();
        excavatorTwo.setBucketWeight(20);
        excavatorTwo.setName("ZAZ");
        excavatorTwo.setColor("blue");
        return List.of(excavatorOne, excavatorTwo);
    }
}
