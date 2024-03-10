package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;
import java.util.Random;

public interface MachineProducer<T extends Machine> {
    Random rand = new Random();
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */
    List<T> get();
}
