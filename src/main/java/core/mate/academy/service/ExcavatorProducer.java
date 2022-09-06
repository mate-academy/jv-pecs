package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Caterpillar", 7128));
        excavators.add(new Excavator("JBC", 8211));
        excavators.add(new Excavator("Volvo", 7550));
        return excavators;
    }
}
