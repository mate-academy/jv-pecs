package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    int NUMBER_OF_MACHINES = 3;

    List<? extends Machine> get();
}
