package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer;
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
                return new ArrayList<Machine>();
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
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
