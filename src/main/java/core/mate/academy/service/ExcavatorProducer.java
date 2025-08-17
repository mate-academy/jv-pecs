package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("Bill", "yellow", 1);
        Excavator excavator2 = new Excavator("Mo", "green", 4);
        Excavator excavator3 = new Excavator("Fill", "grey", 2);
        return List.of(excavator1, excavator2, excavator3);
    }
}
