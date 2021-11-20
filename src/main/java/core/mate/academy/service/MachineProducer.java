package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;
//Parameterize MachineProducer in such a way that any implementation NOT using Machine
//or its subtype could NOT be created.

public interface MachineProducer<M extends Machine> { //parametrized with type Machine
    //                                                  or any subtype of Machine
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */
    List<M> get();//правильнее было бы назвать метод produce()
}
