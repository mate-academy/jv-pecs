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
        MachineProducer bulldozers = new BulldozerProducer();
        MachineProducer trucks = new TruckProducer();
        MachineProducer excavators = new ExcavatorProducer();
        List<Machine> result = new ArrayList<>();
        if (type == Bulldozer.class) {
            return (List<Machine>) bulldozers.get();
        }
        if (type == Truck.class) {
            return (List<Machine>) trucks.get();
        }
        if (type == Excavator.class) {
            return (List<Machine>) excavators.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int machinesSize = machines.size();
        for (int i = 0; i < machinesSize; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        int machinesSize = machines.size();
        for (int i = 0; i < machinesSize; i++) {
            machines.get(i).doWork();
        }
    }
}
