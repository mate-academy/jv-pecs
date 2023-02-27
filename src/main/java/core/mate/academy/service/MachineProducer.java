package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<M> {
    int MACHINE_QUANTITY = 3;

    List<M> get();
}
