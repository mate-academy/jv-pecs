package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator("Wheels", 100);
        Excavator excavator1 = new Excavator("Caterpillar", 200);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator);
        excavators.add(excavator1);
        return excavators;
    }
}
