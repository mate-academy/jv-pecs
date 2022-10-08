package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Excavator());
        return bulldozerList;
    }
}
