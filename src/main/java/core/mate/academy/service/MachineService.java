package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {

    List<Machine> getAll(Class<? extends Machine> type);

    <M extends Machine> void fill(List<? super M> machines, M value);

    void startWorking(List<? extends T> machines);
}
