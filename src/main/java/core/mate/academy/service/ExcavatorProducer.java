package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("firstExcavator", "Blue", 101);
        Excavator secondExcavator = new Excavator("secondExcavator","Green",201);
        Excavator thirdExcavator = new Excavator("thirdExcavator", "Orange", 301);
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
