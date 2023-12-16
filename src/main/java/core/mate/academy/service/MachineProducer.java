package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T> {
    List<T> get(Class<? extends Machine> type);
}
