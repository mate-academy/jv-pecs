package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<T extends Machine> {
    List<T> get();
}
