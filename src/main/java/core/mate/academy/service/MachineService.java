package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {

    void fill(List<? super T> machines, T value);

    void startWorking(List<? extends T> machines);

    List<Machine> getAll(Class<? extends T> type);

}
