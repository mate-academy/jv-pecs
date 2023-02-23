package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<T> {
    int COUNT_OF_MACHINES = 3;

    List<T> get();
}
