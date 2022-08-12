package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer extends Excavator implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("Yellow", "John Deere", 3790, "Small");
        Excavator excavator2 = new Excavator("Yellow", "CAT", 4990, "Medium");
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        return excavatorList;
    }
}
