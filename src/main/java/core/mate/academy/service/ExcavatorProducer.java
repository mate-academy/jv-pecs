package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(true, "Excavator1", "Yellow"));
        excavatorList.add(new Excavator(false, "Excavator2", "Red"));
        return excavatorList;
    }
}
