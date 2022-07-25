package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Machine> get() {
        Excavator excavatorOne = new Excavator("excavatorOne", "white", 111.5);
        Excavator excavatorTwo = new Excavator("excavatorTwo", "yellow", 222.5);
        Excavator excavatorThree = new Excavator("excavatorThree", "green", 333.5);
        return List.of(excavatorOne, excavatorTwo, excavatorThree);
    }
}
