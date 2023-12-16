package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Machine> {
    @Override
    public List<Machine> get(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        Excavator excavatorOne = new Excavator();
        Excavator excavatorTwo = new Excavator();
        machines.add(excavatorOne);
        machines.add(excavatorTwo);
        return machines;
    }
}
