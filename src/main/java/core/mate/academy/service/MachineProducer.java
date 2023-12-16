package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<T> {
    List<Machine> get(Class<? extends Machine> type);
}
