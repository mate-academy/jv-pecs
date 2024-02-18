package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final List<Excavator> EXCAVATOR_LIST = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        var firstExcavator = new Excavator("First Excavator", "Red", "Large Bucket");
        var secondExcavator = new Excavator("Second Excavator", "Orange", "Small Bucket");
        EXCAVATOR_LIST.add(firstExcavator);
        EXCAVATOR_LIST.add(secondExcavator);
        return EXCAVATOR_LIST;
    }
}
