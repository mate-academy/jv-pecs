package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T> {

    List<T> getAll(Class<?> type);

    void fill(List<? super Machine> machines, T value);

    void startWorking(List<? extends T> machines);
}
