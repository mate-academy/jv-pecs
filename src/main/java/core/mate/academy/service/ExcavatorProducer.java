package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> listOfExcavators = new ArrayList<>();
        listOfExcavators.add(new Excavator("crawler", 5));
        listOfExcavators.add(new Excavator("wheeled", 8));
        return listOfExcavators;
    }
}
