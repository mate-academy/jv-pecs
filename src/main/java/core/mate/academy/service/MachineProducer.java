package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<T> {
    int MODELS_CANT = 2;

    List<T> get();
}
