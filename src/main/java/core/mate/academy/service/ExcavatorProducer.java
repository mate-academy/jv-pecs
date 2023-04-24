package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator first = new Excavator(1200, "Wheels");
        Excavator second = new Excavator(1500, "Tracks");
        Excavator third = new Excavator(1300, "Wheels");
        List<Excavator> excavators = List.of(first, second, third);
        return excavators;
    }
}
