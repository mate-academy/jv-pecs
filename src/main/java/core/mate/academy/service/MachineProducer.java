package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<M extends Machine> {

    /**
     * In your implementations - create 2-3 models, add them to the list and return
     *
     * @return - the list of models
     */
    List<M> get();
}
