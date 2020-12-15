package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("Handler", "Brown", 5),
                new Excavator("Grabber", "Red", 4),
                new Excavator("Bandit", "White", 6));
    }
}
