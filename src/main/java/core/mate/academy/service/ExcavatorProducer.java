package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = List.of(new Excavator(),new Excavator(),new Excavator());
        return excavators;
    }
}
