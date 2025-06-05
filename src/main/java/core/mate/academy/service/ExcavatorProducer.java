package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Den", "red", 25));
        excavatorList.add(new Excavator("Bob", "blue", 23));
        excavatorList.add(new Excavator("Bill", "green", 18));
        return excavatorList;
    }
}
