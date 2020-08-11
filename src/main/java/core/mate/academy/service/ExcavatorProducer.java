package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("Ukraina", 2000);
        Excavator secondExcavator = new Excavator();
        return Arrays.asList(firstExcavator, secondExcavator);
    }
}
