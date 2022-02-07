package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator(55, "yellow", "wheel");
        Excavator secondExcavator = new Excavator(65, "red", "track");
        Excavator thirdExcavator = new Excavator(45, "black", "wheel");
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
