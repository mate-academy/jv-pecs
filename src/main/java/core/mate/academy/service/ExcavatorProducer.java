package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator("JCB", 1000);
    private Excavator excavator2 = new Excavator("Zoomlion", 1500);
    private List<Excavator> excavators = new ArrayList<>();

    @Override
    public List get() {
        excavators.add(excavator1);
        excavators.add(excavator2);
        return excavators;
    }
}
