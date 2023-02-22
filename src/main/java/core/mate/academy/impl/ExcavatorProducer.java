package core.mate.academy.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private List<Excavator> excavatorList = new ArrayList<>();

    @Override
    public List get() {
        excavatorList.add(new Excavator("excavator1", "green", "electric"));
        excavatorList.add(new Excavator("excavator2", "gray", "diesel"));
        excavatorList.add(new Excavator("excavator3", "dark green", "diesel"));
        return excavatorList;
    }
}
