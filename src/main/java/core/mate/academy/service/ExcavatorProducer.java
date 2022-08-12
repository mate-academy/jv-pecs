package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer extends Excavator implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Yellow", "John Deere", 3790, "Small"));
        excavatorList.add(new Excavator("Yellow", "CAT", 4990, "Medium"));
        return excavatorList;
    }
}
