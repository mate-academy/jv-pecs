package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavator = new ArrayList<>();
        excavator.add(new Excavator(200, 50));
        excavator.add(new Excavator(300,60));
        excavator.add(new Excavator(400, 70));
        return excavator;
    }
}
