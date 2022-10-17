package core.mate.academy.producers;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    List<T> get();
}
