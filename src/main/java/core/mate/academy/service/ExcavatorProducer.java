package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> newList = new ArrayList<>();
        newList.add(new Excavator());
        newList.add(new Excavator());
        return newList;
    }
}
