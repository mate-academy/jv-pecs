package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<E extends Machine> {

    List<E> getAll(Class<? extends E> type);

    void fill(List<? super E> machines, E value);

    void startWorking(List<? extends E> machines);
}
