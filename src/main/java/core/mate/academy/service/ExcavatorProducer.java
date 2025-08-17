package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("CAT", 1500, 460));
        excavatorList.add(new Excavator("JCB", 2500, 380));
        excavatorList.add(new Excavator("John Deere", 3000, 590));
        return excavatorList;
    }
}
