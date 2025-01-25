package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T>, MachineProducer {
    private List<T> machineList = new ArrayList<>();

    public MachineServiceImpl() {
        machineList.add((T) new Bulldozer());
        machineList.add((T) new Excavator());
        machineList.add((T) new Truck());
    }

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type parameter cannot be null");
        }
        List<T> result = new ArrayList<>();
        for (T machine : machineList) {
            if (machine.getClass().equals(type)) {
                result.add(machine);
            }
        }
        return result.isEmpty() ? Collections.emptyList() : result;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        if (machines == null) {
            throw new IllegalArgumentException("Machines list cannot be null");
        }
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        if (machines == null) {
            throw new IllegalArgumentException("Machines list cannot be null");
        }
        for (T machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public List<? super Machine> get() {
        return List.of(machineList);
    }
}
