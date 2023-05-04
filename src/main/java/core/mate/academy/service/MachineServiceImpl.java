package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.service.impl.BulldozerProducer;
import core.mate.academy.service.impl.ExcavatorProducer;
import core.mate.academy.service.impl.TruckProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final TruckProducer truckProducer = new TruckProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        String className = type.getSimpleName();
        MachineProducer<? extends Machine> machineProducer;
        switch (className) {
            case "Bulldozer":
                machineProducer = bulldozerProducer;
                break;
            case "Excavator":
                machineProducer = excavatorProducer;
                break;
            case "Truck":
                machineProducer = truckProducer;
                break;
            default:
                return new ArrayList<>();
        }
        return new ArrayList<>(machineProducer.get());
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
