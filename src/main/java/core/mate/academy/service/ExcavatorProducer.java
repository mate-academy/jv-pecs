package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        firstExcavator.setType("Heavy");
        Excavator secondExcavator = new Excavator();
        firstExcavator.setSize(25);
        secondExcavator.setType("little");
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(firstExcavator);
        excavatorList.add(secondExcavator);
        return excavatorList;
    }
}
