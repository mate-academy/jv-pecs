package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Excavator excavator = new Excavator();
    private final Excavator excavator1 = new Excavator(true, 0, "Yellow");
    private final Excavator excavator2 = new Excavator(false, 13, "Orange");

    @Override
    public List<Excavator> get() {
        return List.of(excavator, excavator1, excavator2);
    }
}
