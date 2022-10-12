package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        List<Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines = new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            machines = new ExcavatorProducer().get();
        }
        if (type == Truck.class) {
            machines = new TruckProducer().get();
        }
        return machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        if (machines == null) {
            return;
        }
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        if (machines == null) {
            return;
        }
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
