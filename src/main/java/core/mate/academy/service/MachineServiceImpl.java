package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    @SuppressWarnings("unchecked")
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer;
        List<? extends Machine> machines;
        if (type == null) {
            throw new NullPointerException("Input machine class can't be null");
        }
        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
            machines = machineProducer.get();
            return (List<Machine>) machines;
        } else if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
            machines = machineProducer.get();
            return (List<Machine>) machines;
        } else if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
            machines = machineProducer.get();
            return (List<Machine>) machines;
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        Machine machine;
        for (Machine value : list) {
            machine = value;
            machine.doWork();
        }
    }
}

