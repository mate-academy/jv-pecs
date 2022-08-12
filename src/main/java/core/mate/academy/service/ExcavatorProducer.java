package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavatorList;

    public ExcavatorProducer() {
        excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("excavator1", "Red"));
        excavatorList.add(new Excavator("excavator2", "Yellow"));
        excavatorList.add(new Excavator("excavator3", "Black"));
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
