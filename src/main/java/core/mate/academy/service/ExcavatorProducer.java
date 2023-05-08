package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        Excavator secondExcavator = new Excavator();
        firstExcavator.setName("JCB");
        firstExcavator.setColor("Black");
        secondExcavator.setName("Hyundai");
        secondExcavator.setColor("Blue");
        return new ArrayList<>(List.of(firstExcavator, secondExcavator));
    }
}
