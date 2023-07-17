package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final Excavator first = new Excavator();
    private static final Excavator second = new Excavator();
    private static final Excavator third = new Excavator();

    @Override
    public List<Excavator> get() {
        return List.of(first, second, third);
    }
}
