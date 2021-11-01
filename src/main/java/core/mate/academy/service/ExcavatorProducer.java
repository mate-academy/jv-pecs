package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("CAT", "Yellow", 26));
        excavators.add(new Excavator("CAT", "Yellow", 26));
        excavators.add(new Excavator("CAT", "Yellow", 26));
        return excavators;
    }
}
