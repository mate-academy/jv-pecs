package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<M extends Machine> {
    List<Machine> getAll(Class type);

    void fill(List<? super M> machines, Machine value);

    void startWorking(List<? extends M> machines);
}
