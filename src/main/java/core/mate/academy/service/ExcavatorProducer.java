package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("excavator1", "Yellow", 2000));
        excavators.add(new Excavator("excavator2", "Brown", 4600));
        return excavators;
    }
}
