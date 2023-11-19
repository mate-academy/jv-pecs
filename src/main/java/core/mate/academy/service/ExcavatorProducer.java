package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = new ArrayList<>();

    {
        excavators.add(new Excavator("JCB"));
        excavators.add(new Excavator("CAT"));
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
