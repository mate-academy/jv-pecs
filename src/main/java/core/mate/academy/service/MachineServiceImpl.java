package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public <T extends Machine> List<Machine> getAll(Class<T> type) {
        MachineProducer machineProducer = null;
        if (type == Bulldozer.class) {
            return new BulldozerProducer().get();
        }
        if (type == Truck.class) {
            machineProducer = new TruckProducer();
        }
        if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
        }
        return Collections.emptyList();
    }

    @Override
    public <T extends Machine> void fill(List<? super Machine> machines, Machine machine) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<Machine> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
