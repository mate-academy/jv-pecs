package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("Caterpillar", "Red", 300);
        Excavator secondExcavator = new Excavator("JCB", "Green", 400);
        Excavator thirdExcavator = new Excavator("John Deere", "Blue",500);
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
