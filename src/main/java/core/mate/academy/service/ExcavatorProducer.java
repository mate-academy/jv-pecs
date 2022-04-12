package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        Excavator model = new Excavator();
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(model);
        return excavators;
    }
}
