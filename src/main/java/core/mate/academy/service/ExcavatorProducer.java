package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("Komatsu", "yellow", 0.5),
                new Excavator("Case", "red", 0.8),
                new Excavator("Caterpillar", "yellow", 1.0));
    }
}
