package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator1", "yellow",55, 15));
        excavators.add(new Excavator("Excavator2", "black",45, 12));
        excavators.add(new Excavator("Excavator3", "green",50, 22));
        return excavators;
    }
}
