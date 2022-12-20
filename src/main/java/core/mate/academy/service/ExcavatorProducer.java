package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = new ArrayList<>();
    private Excavator excavator1 = new Excavator();
    private Excavator excavator2 = new Excavator();
    private Excavator excavator3 = new Excavator();

    @Override
    public List<Excavator> get() {
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
