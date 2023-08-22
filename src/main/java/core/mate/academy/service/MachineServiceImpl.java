package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducerStrategy producerStrategy;

    public MachineServiceImpl() {
        producerStrategy = new MachineProducerStrategy();
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        return new ArrayList<>(producerStrategy.getMachineProducerStrategy(type).get());
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        if (machines != null) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, value);
            }
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Machine::doWork);
    }
}
