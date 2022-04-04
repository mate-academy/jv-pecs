package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerExcavator implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        Excavator excavatorJune = new Excavator("June", "yellow", 2018, "Japanese");
        Excavator excavatorAugust = new Excavator("August", "red", 1990, "Poland");

        excavatorList.add(excavatorJune);
        excavatorList.add(excavatorAugust);
        return excavatorList;
    }
}
