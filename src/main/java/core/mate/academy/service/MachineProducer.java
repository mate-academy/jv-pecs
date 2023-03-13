package core.mate.academy.service;

import java.util.List;

public interface MachineProducer<E> {
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */
    List<? extends E> get();
}
