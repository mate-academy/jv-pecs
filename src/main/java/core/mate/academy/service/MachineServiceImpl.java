package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final List<MachineProducer> machineProducers = List.of(new BulldozerProducer(),
            new ExcavatorProducer(),
            new TruckProducer());

    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<? extends Machine> machines = new ArrayList<>();
        for (MachineProducer machineProducer : machineProducers) {
            if (machineProducer.getClassName().equals(type.toString())) {
                machines = machineProducer.get();
            }
        }
        return (List<T>) new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
