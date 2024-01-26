package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

/**
 * Parameterize this service and add its implementation in a separate class.
 */
public interface MachineService<T extends Machine> {

    /**
     * Return the list of machines.
     @@ -16,7 +17,7 @@ public interface MachineService {
      * @param type - any class of Machine sub class. For example: Truck.class or Bulldozer.class
     * @return the list of machines
     */
    List<T> getAll(Class<? extends T> type);

    /**
     * Fill the machines list with passed value
     @@ -26,13 +27,13 @@ public interface MachineService {
      * @param machines - list of machines to be filled with value
     * @param value    - any object of machine sub class
     */
    void fill(List<? super T> machines, Machine value);
    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as list of trucks.
     *
     * @param machines - the list of machines
     */

    void startWorking(List<? extends T> machines);
}
