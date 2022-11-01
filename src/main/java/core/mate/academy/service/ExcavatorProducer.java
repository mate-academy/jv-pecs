package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(1,1);
        Excavator excavator2 = new Excavator(2,2);
        Excavator excavator3 = new Excavator(3,3);
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        excavatorList.add(excavator3);
        return excavatorList;
    }
}
