package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator(1, "big");
        Excavator secondExcavator = new Excavator(2, "small");
        Excavator thirdExcavator = new Excavator(3, "medium");
        firstExcavator.setName("Vasiliy");
        secondExcavator.setName("Petr");
        thirdExcavator.setName("Georgiy");
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
