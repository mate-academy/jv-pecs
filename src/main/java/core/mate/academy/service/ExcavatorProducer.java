package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> bulldozerList = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        bulldozerList.add(new Excavator());
        return bulldozerList;
    }
}
