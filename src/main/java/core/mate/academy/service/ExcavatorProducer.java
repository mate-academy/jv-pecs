package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator first = new Excavator("volvo", "black", 70, 120);
        Excavator second = new Excavator("mercedes", "green", 75, 130);
        Excavator third = new Excavator("renault", "red", 65, 120);
        return List.of(first, second, third);
    }
}
