package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator one = new Excavator("one", 1, 1.1);
        Excavator two = new Excavator("two", 2, 2.2);
        Excavator three = new Excavator("three", 3, 3.3);
        return List.of(one, two, three);
    }
}
