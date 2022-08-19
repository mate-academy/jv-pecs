package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator("Wheels", 100);
        Excavator excavatorTwo = new Excavator("Caterpillar", 200);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavatorOne);
        excavators.add(excavatorTwo);
        return excavators;
    }
}
