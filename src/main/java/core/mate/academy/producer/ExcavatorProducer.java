package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<? extends Machine> get() {
        List<Excavator> machines = new ArrayList();
        machines.add(new Excavator("Submarine", "yellow", 1, "track"));
        machines.add(new Excavator("GirlMachine", "ping", 2, "wheel"));
        return machines;
    }
}
