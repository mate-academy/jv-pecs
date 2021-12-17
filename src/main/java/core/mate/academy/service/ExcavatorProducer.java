package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> resultList = new ArrayList<>();
        resultList.add(new Excavator());
        resultList.add(new Excavator());
        return resultList;
    }
}
