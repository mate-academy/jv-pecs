package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private List<Excavator> excavatorList;

    public ExcavatorProducer() {
        excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator());
        excavatorList.add(new Excavator());
        excavatorList.add(new Excavator());
    }

    @Override
    public List get() {
        return excavatorList;
    }
}
