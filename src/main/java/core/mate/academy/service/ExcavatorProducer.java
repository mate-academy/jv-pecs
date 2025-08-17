package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        Excavator smallExcavator = new Excavator("smallExcavator", "blue", 5);
        Excavator middleExcavator = new Excavator("middleExcavator", "green", 10);
        Excavator bigExcavator = new Excavator("bigExcavator", "blue", 15);
        ArrayList<Excavator> excavators = new ArrayList<>();
        excavators.add(smallExcavator);
        excavators.add(middleExcavator);
        excavators.add(bigExcavator);
        return excavators;
    }
}
