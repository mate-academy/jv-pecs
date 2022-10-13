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
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            MachineProducer bulldozerProducer = new BulldozerProducer();
            List<? extends Machine> machines = bulldozerProducer.get();
            return new ArrayList<>(machines);
        } else if (type == Excavator.class) {
            MachineProducer excavatorProducer = new ExcavatorProducer();
            List<? extends Machine> machines = excavatorProducer.get();
            return new ArrayList<>(machines);
        } else if (type == Truck.class) {
            MachineProducer truckProducer = new TruckProducer();
            List<? extends Machine> machines = truckProducer.get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        machines.clear();
        for (int i = 0; i < size; i++) {
            machines.add(value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}
