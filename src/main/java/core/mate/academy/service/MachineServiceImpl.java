package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> list = new ArrayList<>();
        MachineProducer machineProducer = new MachineProducerImpl();
        int size = machineProducer.get().size();
        for (int i = 0; i < size; i++) {
            if (machineProducer.get().get(i).getClass() == type) {
                list.add(machineProducer.get().get(i));
            }
        }
        return list.subList(0, list.size());
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}
