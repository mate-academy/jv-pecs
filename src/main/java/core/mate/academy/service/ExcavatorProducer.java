package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Excavator1", "red", 3, 2016));
        excavatorList.add(new Excavator("Excavator2", "green", 5, 2018));
        excavatorList.add(new Excavator("Excavator3", "grey", 7, 2021));
        return excavatorList;
    }
}
