package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Workable;
import java.util.List;

public interface MachineService<T extends Machine> {

    List<T> getAll(Class<? extends Machine> obj);

    void fill(List<? super T> machines, T value);

    default void startWorking(List<? extends Workable> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
