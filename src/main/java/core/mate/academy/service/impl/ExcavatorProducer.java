package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator one = new Excavator("OneExcavator", "Blue", 50);
        Excavator two = new Excavator("TwoExcavator", "Black", 75);
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(one);
        excavatorList.add(two);
        return excavatorList;
    }
}
