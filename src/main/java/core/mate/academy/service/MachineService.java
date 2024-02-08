package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.List;

/**
 * Parameterized interface for machine service.
 * @param <T> The type of machines handled by the service.
 */
public interface MachineService<T extends Machine> {

    /**
     * Return the list of machines based on the input class type.
     *
     * @param type - Class of the machine subtype.
     * @return the list of machines.
     */
    List<? extends Machine> getAll(Class<T> type);

    /**
     * Fill the machines list with passed value.
     *
     * @param machines - list of machines to be filled with value.
     * @param value    - any object of machine sub class.
     */
    void fill(List<T> machines, T value);

    /**
     * Call the method doWork() from each machine.
     *
     * @param machines - the list of machines.
     */
    void startWorking(List<T> machines);
}
