package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<? extends Machine> machines = null;
        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i) == type) {
                machines = machineProducers.get(i).get();
                break;
            }
        }
        return machines == null ? Collections.emptyList() : (List<T>) machines;
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
