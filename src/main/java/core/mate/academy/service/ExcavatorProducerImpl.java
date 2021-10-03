package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Ducato", "yellow", 4));
        excavatorList.add(new Excavator("Boxer", "red", 8));
        excavatorList.add(new Excavator("Taxo", "green", 6));
        return excavatorList;
    }
}
