package core.mate.academy.producers;

import java.util.List;

public interface MachineProducer<T> {

    List<T> get();
}
