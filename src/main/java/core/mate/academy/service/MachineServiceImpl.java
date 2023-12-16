package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public class MachineServiceImpl implements MachineService {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        return new MachineProducerImpl().get(type);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {

    }
}
