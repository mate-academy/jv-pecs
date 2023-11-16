package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator firstExcavator = new Excavator("JCB", "red", 7);
    private Excavator secondExcavator = new Excavator("Hyundai", "yellow", 10);

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(firstExcavator);
        excavatorList.add(secondExcavator);
        return excavatorList;
    }
}
