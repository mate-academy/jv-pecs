package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator doosan = new Excavator();
    private Excavator komatsu = new Excavator();

    @Override
    public List<Excavator> get() {
        return List.of(komatsu, doosan);
    }
}
