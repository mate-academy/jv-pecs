package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = List.of(new Excavator("excavator1", "black", 11),
                new Excavator("excavator2", "white", 21),
                new Excavator("excavator3", "grey", 31));
        return excavators;
    }
}
