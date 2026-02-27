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
        List<Machine> allMachines = new ArrayList<>();

        if (type == Bulldozer.class) {
            allMachines.addAll(new BulldozerProducer().get());
        }

        if (type == Excavator.class) {
            allMachines.addAll(new ExcavatorProducer().get());
        }

        if (type == Truck.class) {
            allMachines.addAll(new TruckProducer().get());
        }
        return allMachines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(machine -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
