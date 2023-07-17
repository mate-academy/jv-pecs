package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private BulldozerProducer bulldozerProducer;
    private ExcavatorProducer excavatorProducer;
    private TruckProducer truckProducer;

    public MachineServiceImpl() {
        bulldozerProducer = new BulldozerProducer();
        excavatorProducer = new ExcavatorProducer();
        truckProducer = new TruckProducer();
    }

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
        return new ArrayList<>((List<T>) machines);
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
