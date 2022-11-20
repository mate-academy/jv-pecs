package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Workable;

import java.util.List;

public interface MachineProducer<T extends Machine> {
    int MEMBERS_OF_LIST = 2;
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */
    List<T> get();
}
