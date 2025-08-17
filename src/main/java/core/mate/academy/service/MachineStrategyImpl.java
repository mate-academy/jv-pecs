package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.Map;

public class MachineStrategyImpl implements MachineStrategy {
    private final Map<Class<? extends Machine>, MachineProducer<? extends Machine>>
            machineProducers;

    public MachineStrategyImpl(Map<Class<? extends Machine>, MachineProducer<? extends Machine>>
                                       machineProducers) {
        this.machineProducers = machineProducers;
    }

    @Override
    public MachineProducer<? extends Machine> get(Class<? extends Machine> type) {
        return machineProducers.get(type);
    }
}
