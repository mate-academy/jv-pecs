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
        MachineProducer<? extends Machine> producer = producerStrategy
                .getMachineProducerStrategy(type);
        return new ArrayList<>(producer.get());
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Machine::doWork);
    }
}
