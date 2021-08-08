package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("EXCA2000", "yellow", 1988));
        excavatorList.add(new Excavator("EXCA3000", "red", 2005));
        excavatorList.add(new Excavator("EXCA4000", "blue", 2004));
        return excavatorList;
    }
}
