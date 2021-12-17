package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List get() {
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        Excavator excavator3 = new Excavator();
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        excavatorList.add(excavator3);
        return excavatorList;
    }
}
