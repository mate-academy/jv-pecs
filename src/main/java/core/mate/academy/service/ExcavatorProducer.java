package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private List<Excavator> excavatorList = new ArrayList<>();

    public ExcavatorProducer() {
        excavatorList.add(new Excavator(25, 0.6));
        excavatorList.add(new Excavator(34, 1));
        excavatorList.add(new Excavator(39, 2));
    }

    @Override
    public List get() {
        return excavatorList;
    }
}
