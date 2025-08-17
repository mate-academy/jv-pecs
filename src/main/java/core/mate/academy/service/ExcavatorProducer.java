package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Bulldozer X20", "Yellow", 2));
        excavatorList.add(new Excavator("Bulldozer X10", "Yellow", 1));
        excavatorList.add(new Excavator("Bulldozer X3", "Orange", 1));
        return excavatorList;
    }
}
