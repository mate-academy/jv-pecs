package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator first = new Excavator("First", "Red", "tracked", "universal");
        Excavator second = new Excavator("Second", "Yellow", "tracked", "career");
        Excavator third = new Excavator("Third", "Green", "wheeled", "mine");
        excavators.add(first);
        excavators.add(second);
        excavators.add(third);
        return excavators;
    }
}
