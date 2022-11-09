package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("firstExcavator", "Purple", 180);
        Excavator secondExcavator = new Excavator("secondExcavator","Green",190);
        Excavator thirdExcavator = new Excavator("thirdExcavator", "Orange", 210);
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
