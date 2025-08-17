package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        Excavator secondExcavator = new Excavator();
        Excavator thirdExcavator = new Excavator();

        firstExcavator.setName("first");
        secondExcavator.setName("second");
        thirdExcavator.setName("third");

        firstExcavator.setColor("red");
        secondExcavator.setColor("blue");
        thirdExcavator.setColor("green");
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
