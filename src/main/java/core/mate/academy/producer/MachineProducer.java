package core.mate.academy.producer;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    List<T> get();
}
