package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    
    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        if (type == Truck.class) {
            return new ArrayList<>(new TruckProducer().get());
        }
        if (type == Excavator.class) {
            return new ArrayList<>(new ExcavatorProducer().get());
        }
        if (type == Bulldozer.class) {
            return new ArrayList<>(new BulldozerProducer().get());
        }
        return new ArrayList<>();
    }
    
    @Override
    public void fill(List<? super T> machines, T value) {
        Collections.fill(machines, value);
    }
    
    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
