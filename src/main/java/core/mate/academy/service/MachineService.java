package core.mate.academy.service;

import java.util.List;

import core.mate.academy.model.Machine;

/**
 * Add only one implementation of this service
 */
public interface MachineService {
    List<Machine> getAll(Class type);

    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as list of tracks.
     * @param machines - the list of machines
     */
    void startWorking(List<Object> machines);
}
