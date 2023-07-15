package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {
    List<T> getAll(Class type);

    void fill(List<Object> machines, T value);

    void startWorking(List<?> machines);
}
