package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator1", "black", 45));
        excavators.add(new Excavator("Excavator2", "grin", 75));
        excavators.add(new Excavator("Excavator3", "pink", 105));

        return excavators;
    }
}
