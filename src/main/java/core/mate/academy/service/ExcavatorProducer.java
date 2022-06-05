package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("newExcavator", "Red", 12));
        excavators.add(new Excavator("oldExcavator", "Gray", 15));
        excavators.add(new Excavator("mainExcavator", "Yellow", 20));
        return excavators;
    }
}
