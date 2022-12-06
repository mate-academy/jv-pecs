package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavators = new ArrayList<>();

    {
        excavators.add(new Excavator("John Deere", "green"));
        excavators.add(new Excavator("CAT", "yellow"));
        excavators.add(new Excavator("New Holland", "blue"));
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
