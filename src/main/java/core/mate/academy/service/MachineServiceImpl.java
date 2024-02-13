package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        List<Machine> result = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            result.addAll(new BulldozerProducer().get());
        } else if (type.equals(Excavator.class)) {
            result.addAll(new ExcavatorProducer().get());
        } else if (type.equals(Truck.class)) {
            result.addAll(new TruckProducer().get());
        }
        return result;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            if (machine instanceof Workable) {
                ((Workable) machine).doWork();
            }
        }
    }
}
