package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavatorList = new ArrayList<Excavator>();

    @Override
    public List<Excavator> get() {
        excavatorList.add(new Excavator());
        return excavatorList;
    }
}
