package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.strategy.MachineProducerStrategy;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducerStrategy machineProducerStrategy = new MachineProducerStrategy();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = machineProducerStrategy
                .getMachineProducerByMachineType(type.getSimpleName())
                .get();
        return new ArrayList<>(machines);
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
