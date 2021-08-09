package core.mate.academy.service;

import java.util.List;
import core.mate.academy.model.Machine;

/**
 * Parameterize this service and add its implementation in a separate class.
 */
public interface MachineService<T extends Machine> {

    List<T> getAll(Class<? extends Machine> type);

    void fill(List<? super Machine> machines, T value);

    void startWorking(List<? extends Machine> machines);
}
