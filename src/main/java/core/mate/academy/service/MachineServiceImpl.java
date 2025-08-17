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
        MachineProducer machineProducer;
        String className = type.getSimpleName();
        switch (className) {
            case "Excavator":
                machineProducer = new ExcavatorProducer();
                break;
            case "Bulldozer":
                machineProducer = new BulldozerProducer();
                break;
            case "Truck":
                machineProducer = new TruckProducer();
                break;
            default:
                return Collections.emptyList();
        }
        return new ArrayList<>(machineProducer.get());
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
