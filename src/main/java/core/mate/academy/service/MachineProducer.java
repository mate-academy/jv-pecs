package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    int AMOUNT_OF_MODELS = 3;

    List<? extends Machine> get();
}
