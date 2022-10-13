package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(11);
        Excavator excavator2 = new Excavator(21);
        Excavator excavator3 = new Excavator(31);
        List<Excavator> excavators = List.of(excavator1, excavator2, excavator3);
        return excavators;
    }
}
