package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<N extends Machine> {
    List<N> getAll(Class<? extends N> type);

    void fill(List<? super N> machines, N value);

    void startWorking(List<? extends N> machines);
}
