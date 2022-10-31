package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator>{
    private final Excavator excavator1 = new Excavator();
    private final Excavator excavator2 = new Excavator();
    private final Excavator excavator3 = new Excavator();

    @Override
    public List<Excavator> get() {
        return List.of(excavator1, excavator2, excavator3);
    }
}
