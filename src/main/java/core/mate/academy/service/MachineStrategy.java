package core.mate.academy.service;

import core.mate.academy.model.Machine;

public interface MachineStrategy {
    MachineProducer<? extends Machine> get(Class<? extends Machine> type);
}
