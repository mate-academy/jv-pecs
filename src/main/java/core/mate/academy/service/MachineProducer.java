package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<M> {
    List<? extends M> get();
}
