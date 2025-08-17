package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Excavator excavator0 = new Excavator();
    private final Excavator excavator1 = new Excavator(true, true, 2);
    private final Excavator excavator2 = new Excavator(false, false, 1);

    @Override
    public List<Excavator> get() {
        return List.of(excavator0, excavator1, excavator2);
    }
}
