package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator(true, 0.57, 1);
        firstExcavator.setName("Excavator1");
        firstExcavator.setColor("White");
        Excavator secondExcavator = new Excavator(false, 0.23, 5);
        secondExcavator.setName("Excavator2");
        secondExcavator.setColor("Orange");
        List<Excavator> list = List.of(firstExcavator, secondExcavator);
        return list;
    }
}
