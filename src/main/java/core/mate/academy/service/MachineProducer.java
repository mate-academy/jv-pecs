package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<E extends Machine> {
    int DEFAULT_NUMBER_OF_MACHINES = 3;

    List<? extends Machine> get();
}
