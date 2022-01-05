package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

/**
 * Parameterize this service and add its implementation in a separate class.
 */
public interface MachineService<T extends Machine> {
    /**
     * Return the list of machines.
     * In the implementation of this method please use your MachineProducer implementations
     * See that 'Class type' is not parametrized.
     * Consider to parametrize this Class< PARAMETRIZE_ME > with specific wildcard bounding
     *
     * @param type - any class of Machine sub class. For example: Truck.class or Bulldozer.class
     * @return the list of machines
     */
    List<T> getAll(Class<? extends T> type);

    void fill(List<? super T> machines, T value);

    void startWorking(List<? extends T> machines);
}
