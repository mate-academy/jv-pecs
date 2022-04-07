package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("small", "King", "brown"));
        excavators.add(new Excavator("medium", "Fish", "blue"));
        excavators.add(new Excavator("large","Lonely Wolf", "black"));
        return excavators;
    }
}
