package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Excavator sany = new Excavator();
    private final Excavator hitachi = new Excavator();
    private final Excavator doosan = new Excavator();

    @Override
    public List<Excavator> get() {
        return List.of(sany, hitachi, doosan);
    }
}
