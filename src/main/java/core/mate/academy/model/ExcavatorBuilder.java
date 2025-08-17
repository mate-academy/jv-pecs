package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorBuilder implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        return List.of(new Excavator(300),
                new Excavator(500), new Excavator(1000));
    }
}
