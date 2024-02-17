package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<? extends Excavator> get() {
        return List.of(new Excavator(3000),
                new Excavator(2000),
                new Excavator(1000));
    }
}
