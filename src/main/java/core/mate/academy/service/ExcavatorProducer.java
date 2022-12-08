package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer{
    Excavator excavator = new Excavator();
    Excavator excavator1 = new Excavator();
    Excavator excavator2 = new Excavator();
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavator);
        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        return excavatorList;
    }
}
