package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        Excavator excavator1 = new Excavator(true, "Excavator1", "Yellow");
        Excavator excavator2 = new Excavator(true, "Excavator2", "Yellow");
        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        return excavatorList;
    }
}
