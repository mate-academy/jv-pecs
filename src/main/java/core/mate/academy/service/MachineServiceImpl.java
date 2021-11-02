package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List getAll(Class type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducerImpl().get();
        } else if (type == Truck.class) {
            return new TruckProducerImpl().get();
        } else if (type == Excavator.class) {
            return new ExcavatorProducerImpl().get();
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
