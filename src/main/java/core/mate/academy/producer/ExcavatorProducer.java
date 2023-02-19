package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Submarine", "yellow", 1, "track"));
        excavators.add(new Excavator("GirlMachine", "ping", 2, "wheel"));
        return excavators;
    }
}
