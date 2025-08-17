package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator firstExcavator = new Excavator(500, "CESAB");
    private Excavator secondExcavator = new Excavator(700, "Bruder");

    @Override
    public List<Excavator> get() {
        List<Excavator> listOfExcavators = new ArrayList<>();
        listOfExcavators.add(firstExcavator);
        listOfExcavators.add(secondExcavator);
        return listOfExcavators;
    }
}
