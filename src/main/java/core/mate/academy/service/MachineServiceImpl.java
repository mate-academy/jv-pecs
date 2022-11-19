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
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type != Bulldozer.class && type != Excavator.class && type != Truck.class) {
            return new ArrayList<>();
        }
        MachineProducer<? extends Machine> machineProducer = new TruckProducer();
        if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
        }
        if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();

        }
        List<? extends Machine> machineList = machineProducer.get();
        return new ArrayList<>(machineList);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
