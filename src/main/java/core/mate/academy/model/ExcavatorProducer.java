package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private final Excavator excavator1 = new Excavator();
    private final Excavator excavator2 = new Excavator();
    private final Excavator excavator3 = new Excavator();

    private final List<Excavator> excavators = List.of(excavator1, excavator2, excavator3);

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
