package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        ArrayList listOfExcavators = new ArrayList<>();
        listOfExcavators.add(new Excavator("demolition", 1999));
        listOfExcavators.add(new Excavator("aircraft recycling", 2009));
        return listOfExcavators;
    }
}
