package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {

    /**
     * Return the list of machines.
     *
     * @param type - any class of Machine sub class. For example: Truck.class or Bulldozer.class
     * @return the list of machines
     */
    List<T> getAll(Class<? extends T> type);

    /**
     * Fill the machines list with passed value
     *
     * @param machines - list of machines to be filled with value
     * @param value    - any object of machine sub class
     */
    void fill(List<? super T> machines, T value);

    /**
     * Call the method doWork() from each machine.
     *
     * @param machines - the list of machines
     */
    void startWorking(List<? extends T> machines);
}
