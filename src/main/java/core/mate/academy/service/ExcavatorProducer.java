package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List get() {
        ArrayList<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("SC3", "Red", "disel"));
        excavators.add(new Excavator("SC2", "Green", "disel"));
        excavators.add(new Excavator("SC6", "Yellow", "disel"));
        return excavators;
    }
}
