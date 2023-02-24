package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T> {
    int AMOUNT_TO_CREATE = 3;

    List<? extends Machine> get();
}
