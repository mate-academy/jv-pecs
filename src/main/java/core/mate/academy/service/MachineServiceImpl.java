package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            MachineProducer machineProducer = new BulldozerProducerImpl();
            List<? extends Machine> machines = machineProducer.get();
            return new ArrayList<>(machines);
        }
        if (type.equals(Excavator.class)) {
            MachineProducer machineProducer = new ExcavatorProducerImpl();
            return (List<Machine>) machineProducer.get();
        }
        if (type.equals(Truck.class)) {
            MachineProducer machineProducer = new TruckProducerImpl();
            return (List<Machine>) machineProducer.get();
        }
        return Collections.emptyList();
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
