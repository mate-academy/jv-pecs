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
    public List<Machine> getAll(Class<? extends Machine> type) {
        ProducerStrategy strategy = new ProducerStrategy();
        MachineProducer<? extends Machine> producer = strategy.getMachineProducer(type);
        if (producer != null) {
            List<? extends Machine> machines = producer.get();
            return new ArrayList<>(machines);
        }

        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine: list) {
            machine.doWork();
        }
    }
}
