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
public class MachineServiceImpl<T extends Machine> implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer machineProducer;
        List<Machine> list = new ArrayList<>();
        if (Bulldozer.class.equals(type)) {
            machineProducer = new BulldozerProducer();
            list = new ArrayList<>(machineProducer.get());
        } else if (Excavator.class.equals(type)) {
            machineProducer = new ExcavatorProducer();
            list = new ArrayList(machineProducer.get());
        } else if (Truck.class.equals(type)) {
            machineProducer = new TruckProducer();
            list = new ArrayList<>(machineProducer.get());
        }
        return list;
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}
