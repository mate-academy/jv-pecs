package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("Hyundai", "yellow", 15.0),
                new Excavator("Volvo", "yellow", 12.0),
                new Excavator("Hitachi", "orange", 13.5)
        );
    }
}
