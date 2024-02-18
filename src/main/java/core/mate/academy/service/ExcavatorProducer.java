package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        var firstExcavator = new Excavator("First Excavator", "Red", "Large Bucket");
        var secondExcavator = new Excavator("Second Excavator", "Orange", "Small Bucket");
        return List.of(firstExcavator,secondExcavator);
    }
}
