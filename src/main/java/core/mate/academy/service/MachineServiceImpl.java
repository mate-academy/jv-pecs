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
    public List<Machine> getAll(Class type) {
        MachineProducer machineProducer = null;
        if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
        } else if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
        } else if (type == Truck.class) {
            machineProducer = new TruckProducer();
        } else {
            return List.of();
        }
        List<Machine> machines = machineProducer.get();
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(machine -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(machine -> machine.doWork());
    }
}
