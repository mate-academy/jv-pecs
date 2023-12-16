package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<Machine> {
    List<Machine> get(Class<? extends Machine> type);
}
