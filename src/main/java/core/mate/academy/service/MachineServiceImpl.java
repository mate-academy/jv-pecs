package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T>{
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final TruckProducer truckProducer = new TruckProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();


    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        List<? extends T> machines = Collections.emptyList();
        if (type.equals(Bulldozer.class)) {
            machines = (List<? extends T>) bulldozerProducer.get();
        }
        if (type.equals(Excavator.class)) {
            machines = (List<? extends T>) excavatorProducer.get();
        }
        if (type.equals(Truck.class)) {
            machines = (List<? extends T>) truckProducer.get();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
