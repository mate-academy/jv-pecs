package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = new ArrayList<>();

    {
        Excavator excavator = new Excavator();
        excavator.setName("Excavator");
        excavator.setColor("Red");
        excavator.setMaxDeep(30);
        excavators.add(excavator);
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
