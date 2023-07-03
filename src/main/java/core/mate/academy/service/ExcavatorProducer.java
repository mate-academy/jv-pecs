package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator(20, 4, 6);
        Excavator secondExcavator = new Excavator(30, 6, 8);
        Excavator thirdExcavator = new Excavator(40, 8, 12);
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
