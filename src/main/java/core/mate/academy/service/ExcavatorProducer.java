package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavatorList;

    public ExcavatorProducer() {
        excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("First excavator", "Yellow"));
        excavatorList.add(new Excavator("Second excavator", "Green"));
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
