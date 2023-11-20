package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    public static final int MACHINES_QUANTITY = 3;

    List<T> get();
}
