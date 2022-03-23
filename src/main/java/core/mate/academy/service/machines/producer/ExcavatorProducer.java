package core.mate.academy.service.machines.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("Excavator1", "black", 100, 200);
        Excavator excavator2 = new Excavator("Excavator2", "green", 110, 200);
        return List.of(excavator1, excavator2);
    }
}
