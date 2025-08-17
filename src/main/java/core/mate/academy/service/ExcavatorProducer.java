package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator(100, 101, 111);
        Excavator secondExcavator = new Excavator(200, 202, 222);
        Excavator thirdExcavator = new Excavator(300, 303, 333);
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
