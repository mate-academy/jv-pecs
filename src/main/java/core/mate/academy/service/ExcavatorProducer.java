package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(2000, 800, "Excavator1", "black"));
        excavatorList.add(new Excavator(2500, 900, "Excavator2", "grey"));
        return excavatorList;
    }
}
