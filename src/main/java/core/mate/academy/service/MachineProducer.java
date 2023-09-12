package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * в твоїй імплементаціїї створи 2-3 моделі і додпй їх до листа та поверни лист
     * @return - the list of models
     */
    List<T> get();
}
