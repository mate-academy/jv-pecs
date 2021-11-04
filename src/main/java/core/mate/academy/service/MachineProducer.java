package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<Machine> {
    List<? extends Machine> get();
}
