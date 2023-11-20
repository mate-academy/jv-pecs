package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        return List.of(new Excavator("Kubota", "Yellow", 2008, 280),
                new Excavator("DongFeng", "Blue", 2018, 250),
                new Excavator("Izusu", "Blue", 2003, 250));
    }
}
