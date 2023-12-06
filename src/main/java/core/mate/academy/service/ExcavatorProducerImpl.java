package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        Excavator excavator1 = new Excavator("Exc 3000", "Blue", 60.0, 5.5);
        excavatorList.add(excavator1);
        Excavator excavator2 = new Excavator("Exc 5000", "Yellow", 100.0, 8.5);
        excavatorList.add(excavator2);
        Excavator excavator3 = new Excavator("Exc 800", "Yellow", 20.5, 2.5);
        excavatorList.add(excavator3);
        return excavatorList;
    }
}
