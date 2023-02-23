package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> list = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        createMachines();
        return list;
    }

    private void createMachines() {
        Excavator longReachExcavator = new Excavator(2500, 9);
        Excavator draglineExcavator = new Excavator(1200, 6);
        list.add(longReachExcavator);
        list.add(draglineExcavator);
    }
}
