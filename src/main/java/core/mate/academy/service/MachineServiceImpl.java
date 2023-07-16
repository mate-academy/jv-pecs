package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    public MachineServiceImpl() {
        super();
    }

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type.equals(Bulldozer.class)) {
            return (List<T>) new BulldozerProducer().get();
        } else if (type.equals(Excavator.class)) {
            return (List<T>) new ExcavatorProducer().get();
        } else if (type.equals(Truck.class)) {
            return (List<T>) new TruckProducer().get();
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            if (value.getClass().equals(Bulldozer.class)) {
                machines.set(i, new Bulldozer());
            } else if (value.getClass().equals(Excavator.class)) {
                machines.set(i, new Excavator());
            } else {
                machines.set(i, new Truck());
            }
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
    }
}
