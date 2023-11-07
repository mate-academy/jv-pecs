package core.mate.academy.service;

import java.util.List;

public interface MachineService<T> {
    List<core.mate.academy.model.Machine> getAll(Class<? extends T> type);

    void fill(List<? super T> machines, Object value);

    void startWorking(List<? extends T> machines);
}
