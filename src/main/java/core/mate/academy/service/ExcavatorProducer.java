package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("Excavator 1", "yellow", 3.0);
        Excavator secondExcavator = new Excavator("Excavator 2", "red", 2.0);
        Excavator thirdExcavator = new Excavator("Excavator 3", "orange", 2.5);
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
