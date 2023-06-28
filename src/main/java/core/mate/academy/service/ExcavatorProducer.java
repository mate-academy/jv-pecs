package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator("Excavator1", "yellow", 23);
    private Excavator excavator2 = new Excavator("Excavator2", "pink", 25);

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        return excavators;
    }
}
