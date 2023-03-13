package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List getAll(Class<? extends Machine> type) {
        MachineProducer machineProducer = null;

        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
        }
        if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
        }
        if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
        }
        return machineProducer != null
                ? machineProducer.get()
                : List.of();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
