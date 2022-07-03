package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("firstExcavator", "Yellow", 18));
        excavators.add(new Excavator("secondExcavator", "Blue", 9));
        excavators.add(new Excavator("thirdExcavator", "Orange", 12));
        return excavators;
    }
}
