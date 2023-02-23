package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> listOfExcavators = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_MACHINES; i++) {
            listOfExcavators.add(new Excavator());
        }
        return listOfExcavators;
    }
}
