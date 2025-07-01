package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    int MODELS_COUNT = 2;

    List<T> get();
}
