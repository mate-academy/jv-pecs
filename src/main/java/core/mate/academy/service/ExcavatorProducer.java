package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("Caterpillar", 2.5, 8.5, 45000),
                new Excavator("Volvo", 3.2, 9.1, 52000)
        );
    }
}
