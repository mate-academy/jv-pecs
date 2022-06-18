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
@SuppressWarnings("unchecked")
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer;
        if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
        } else if (type == Truck.class) {
            machineProducer = new TruckProducer();
        } else if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
        } else {
            return new ArrayList<>();
        }
        return (List<Machine>) machineProducer.get();
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
