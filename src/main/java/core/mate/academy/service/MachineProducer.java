package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<M extends Machine> {
    int MACHINE_QUANTITY = 3;
    List<M> get();
}
