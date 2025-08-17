package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            return new ArrayList<>(bulldozerProducer.get());
        } else if (type.equals(Excavator.class)) {
            return new ArrayList<>(excavatorProducer.get());
        } else if (type.equals(Truck.class)) {
            return new ArrayList<>(truckProducer.get());
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
