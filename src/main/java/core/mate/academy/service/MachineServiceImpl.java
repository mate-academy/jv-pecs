package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer machineProducer = compareTypeWithMachines(type);
        if (machineProducer == null) {
            return new ArrayList<>();
        }
        return machineProducer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }

    private MachineProducer compareTypeWithMachines(Class<? extends Machine> type) {
        if (type == null) {
            throw new RuntimeException("Required type is null");
        } else if (type.equals(Bulldozer.class)) {
            return new BulldozerProducer();
        } else if (type.equals(Truck.class)) {
            return new TruckProducer();
        } else if (type.equals(Excavator.class)) {
            return new ExcavatorProducer();
        } else {
            return null;
        }
    }
}
