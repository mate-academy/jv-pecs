package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    int MACHINE_NUMBER_FOR_CREATE = 3;
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */

    String getClassName();

    List<T> get();
}
