package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        List<Machine> machines = new ArrayList<>();
        switch (type.getSimpleName()) {
            case "Bulldozer":
                return machines = new BulldozerProducer().get();
            case "Excavator":
                return machines = new ExcavatorProducer().get();
            case "Truck":
                return machines = new TruckProducer().get();
            default:
                return machines;
        }
    }

    @Override
    public void fill(List<? super T> machines, T value) {
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
