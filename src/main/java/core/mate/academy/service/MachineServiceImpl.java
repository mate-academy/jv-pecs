package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private MachineProducer<? extends Machine> machineProducer;

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
            List<? extends Machine> machines = machineProducer.get();
            return new ArrayList<>(machines);
        }
        if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
            List<? extends Machine> machines = machineProducer.get();
            return new ArrayList<>(machines);
        }
        if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
            List<? extends Machine> machines = machineProducer.get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
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
