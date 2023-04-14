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
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machinesList = Collections.emptyList();
        if (type == Bulldozer.class) {
            machinesList = new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            machinesList = new ExcavatorProducer().get();
        }
        if (type == Truck.class) {
            machinesList = new TruckProducer().get();
        }
        return (List<Machine>) machinesList;
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
