package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("First", "black", "type", "typeGear");
        Excavator excavator2 = new Excavator("Second", "red", "type2", "typeGear2");
        excavators.add(excavator1);
        excavators.add(excavator2);
        return excavators;
    }
}
