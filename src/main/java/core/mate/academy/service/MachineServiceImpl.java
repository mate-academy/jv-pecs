package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    public List<T> getAll(Class<? extends T> type) {
        List<? extends Machine> machines;
        if (type == Bulldozer.class) {
            machines = new BulldozerProducer().get();
        } else if (type == Excavator.class) {
            machines = new ExcavatorProducer().get();
        } else if (type == Truck.class) {
            machines = new TruckProducer().get();
        } else {
            machines = Collections.emptyList();
        }
        List<T> result = new ArrayList<>();
        for (Machine machine : machines) {
            result.add(type.cast(machine));
        }
        return result;
    }

    public void fill(List<? super T> machines, T value) {
        Collections.fill(machines, value);
    }

    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Machine::doWork);
    }
}
