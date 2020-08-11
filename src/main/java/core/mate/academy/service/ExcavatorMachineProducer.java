package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorMachineProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("Hyundai", 1.1);
        Excavator secondExcavator = new Excavator("Komatsu", 1.8);
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(firstExcavator);
        excavatorList.add(secondExcavator);
        return excavatorList;
    }
}
