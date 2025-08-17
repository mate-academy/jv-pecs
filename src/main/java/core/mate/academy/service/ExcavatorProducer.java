package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("Excavator007", "black", 800);
        Excavator excavator2 = new Excavator("Excavator008", "white", 1000);
        Excavator excavator3 = new Excavator("Excavator000", "yellow", 1200);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
