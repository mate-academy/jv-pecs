package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator();
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        List<Excavator> listToReturn = new ArrayList<>();
        listToReturn.add(excavator);
        listToReturn.add(excavator1);
        listToReturn.add(excavator2);
        return listToReturn;
    }
}
