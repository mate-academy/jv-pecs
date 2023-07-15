package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<T> machineList = new ArrayList<>();
        if (type.equals(Truck.class)) {
            machineList = (List<T>) new ArrayList<>(new TruckProducer().get());
        } else if (type.equals(Bulldozer.class)) {
            machineList = (List<T>) new ArrayList<>(new BulldozerProducer().get());
        } else if (type.equals(Excavator.class)) {
            machineList = (List<T>) new ArrayList<>(new ExcavatorProducer().get());
        }
        return machineList;
    }

    @Override
    public void fill(List<? super T> list, T value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
