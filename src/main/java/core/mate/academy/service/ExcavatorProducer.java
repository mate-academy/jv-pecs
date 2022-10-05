package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("ExcavatorOne", "white", 3);
        Excavator excavator2 = new Excavator("ExcavatorTwo", "red", 4);
        Excavator excavator3 = new Excavator("ExcavatorThree", "black", 5);
        return List.of(excavator1, excavator2, excavator3);
    }
}
