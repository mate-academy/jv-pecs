package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<? extends Machine> get() {
        Excavator excavator1 = new Excavator("excavator 1", "grey",
                "mining", "wheeled", "diesel");
        Excavator excavator2 = new Excavator("excavator 2", "black",
                "quarry", "caterpillar", "electric");
        Excavator excavator3 = new Excavator("excavator 3", "white",
                "construction", "wheeled", "electric");
        return List.of(excavator1, excavator2, excavator3);
    }
}
