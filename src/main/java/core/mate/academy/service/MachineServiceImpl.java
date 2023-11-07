package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<? extends Machine> machines = List.of();
        if (type.equals(Bulldozer.class)) {
            machines = bulldozerProducer.get();
        } else if (type.equals(Excavator.class)) {
            machines = excavatorProducer.get();
        } else if (type.equals(Truck.class)) {
            machines = truckProducer.get();
        }
        return (List<T>) machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
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
