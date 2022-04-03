package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerExcavator implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        Excavator excavator1 = new Excavator("June", "yellow", 2018, "Japanese");
        Excavator excavator2 = new Excavator("August", "red", 1990, "Poland");

        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        return excavatorList;
    }
}
