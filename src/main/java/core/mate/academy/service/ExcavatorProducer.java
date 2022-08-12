package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    private final Machine excavator1 = new Excavator();
    private final Machine excavator2 = new Excavator();

    @Override
    public List<Machine> get() {
        return List.of(excavator1, excavator2);
    }
}
