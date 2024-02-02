package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class type) {
        MachineProducer machineProducer;
        switch (type.getSimpleName()) {
            case "Bulldozer":
                machineProducer = new BulldozerProducer();
                break;
            case "Excavator":
                machineProducer = new ExcavatorProducer();
                break;
            case "Truck":
                machineProducer = new TruckProducer();
                break;
            default:
                return Collections.emptyList();
        }
        return machineProducer.get();
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
