package core.mate.academy.service;

import core.mate.academy.impl.ProducerStrategy;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final ProducerStrategy producerStrategy = new ProducerStrategy();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        try {
            MachineProducer<? extends Machine> producer = producerStrategy.getProducers().get(type);
            List<? extends Machine> machines = producer.get();
            return new ArrayList<>(machines);
        } catch (RuntimeException e) {
            return new ArrayList<>();
        }
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
