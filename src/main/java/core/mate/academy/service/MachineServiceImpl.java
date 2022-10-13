package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        switch (type.getSimpleName()) {
            case "Bulldozer":
                return new BulldozerProducer().get();
            case "Excavator":
                return new ExcavatorProducer().get();
            case "Truck":
                return new TruckProducer().get();
            default:
                return new ArrayList<Machine>();
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
