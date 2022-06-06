package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.LinkedList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator10 = new Excavator("Caterpillar 10", "Yellow", 30);
        Excavator excavator20 = new Excavator("Caterpillar", "Yellow", 50);
        List<Excavator> excavators = new LinkedList<>();
        excavators.add(excavator10);
        excavators.add(excavator20);
        return excavators;
    }
}
