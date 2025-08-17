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
        MachineProducer<? extends Machine> machineProducer;
        List<? extends Machine> machines;
        if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
            machines = machineProducer.get();
            return new ArrayList<>(machines);
        }
        if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
            machines = machineProducer.get();
            return new ArrayList<>(machines);
        }
        if (type == Truck.class) {
            machineProducer = new TruckProducer();
            machines = machineProducer.get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
