package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer<T extends Excavator> implements MachineProducer<T> {

    @Override
    public List<T> get() {
        return (List<T>) List.of(new Excavator(), new Excavator(), new Excavator());
    }
}
