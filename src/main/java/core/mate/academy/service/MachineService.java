package core.mate.academy.service;

import java.util.List;

public interface MachineService<Machine> {
    List<Machine> getAll(Class<?> type);

    void fill(List<? super Machine> machines, Machine value);

    void startWorking(List<? extends Machine> machines);
}
