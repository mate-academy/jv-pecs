package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Excavator excavator = new Excavator();
    private final Excavator excavator1 = new Excavator();
    private final Excavator excavator2 = new Excavator();

    public List<Excavator> get() {
        List<Excavator> excavators = Arrays.asList(excavator, excavator1, excavator2);
        return excavators;
    }
}
