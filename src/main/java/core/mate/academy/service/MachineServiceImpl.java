package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List getAll(Class type) {
        List machines;
        String className = type.getSimpleName();
        switch (className) {
            case "Excavator":
                machines = new ExcavatorProducer().get();
                break;
            case "Bulldozer":
                machines = new BulldozerProducer().get();
                break;
            case "Truck":
                machines = new TruckProducer().get();
                break;
            default:
                return Collections.emptyList();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}
