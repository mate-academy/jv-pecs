package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("TR-2", "Black", 4, 4),
                new Excavator("TOL-11", "Black", 11, 10),
                new Excavator("ZM-3", "Red", 3, 3));
    }
}
