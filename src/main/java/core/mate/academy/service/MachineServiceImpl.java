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
        if (type == Bulldozer.class) {
            MachineProducer<?> bulldozers = new BulldozerProducer();
            return (List<Machine>) bulldozers.get();
        }
        if (type == Truck.class) {
            MachineProducer trucks = new TruckProducer();
            return (List<Machine>) trucks.get();
        }
        if (type == Excavator.class) {
            MachineProducer excavators = new ExcavatorProducer();
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
