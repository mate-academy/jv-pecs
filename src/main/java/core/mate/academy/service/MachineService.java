package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {

    List<Machine> getAll(Class<? extends T> type);

    void fill(List<? super T > machines, Machine value);

    void startWorking(List<? extends T> machines);
}
