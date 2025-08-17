package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("excavatorOne", "violet", 1));
        excavatorList.add(new Excavator("excavatorTwo", "black", 2));
        excavatorList.add(new Excavator("excavatorThree", "white", 3));
        return excavatorList;
    }
}
