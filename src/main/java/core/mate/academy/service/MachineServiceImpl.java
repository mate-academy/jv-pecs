package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @SuppressWarnings("unchecked")
    public List<T> getAll(Class<T> type) {
        List<T> result;
        if (type == Bulldozer.class) {
            result = (List<T>) new BulldozerProducer().get();
        } else if (type == Truck.class) {
            result = (List<T>) new TruckProducer().get();
        } else if (type == Excavator.class) {
            result = (List<T>) new ExcavatorProducer().get();
        } else {
            result = new ArrayList<>();
        }
        return result;
    }

         public void fill(List<? super T> machines, T value) {
        for (int i =0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
