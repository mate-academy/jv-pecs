package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<T> {
    int MACHINE_QUANTITY = 3;
    List<T> get();
}
