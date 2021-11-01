package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> excavators = new ArrayList<>();
        excavators.add(new Excavator("CAT", "Yellow", 26));
        excavators.add(new Excavator("CAT", "Yellow", 26));
        excavators.add(new Excavator("CAT", "Yellow", 26));
        return excavators;
    }
}
