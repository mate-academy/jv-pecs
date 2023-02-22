package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("DER", "red", true),
                new Excavator("NEERG", "green", true),
                new Excavator("EULB", "blue", true));
    }
}
