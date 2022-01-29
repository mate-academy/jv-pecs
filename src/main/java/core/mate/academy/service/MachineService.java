package core.mate.academy.service;

import java.util.List;

public interface MachineService<M> {
    List<M> getAll(Class<? extends M> type);

    void fill(List<? super M> machines, M value);

    void startWorking(List<? extends M> machines);
}
