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
    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (Bulldozer.class.equals(type)) {
            machines = new BulldozerProducer().get();
        } else if (Excavator.class.equals(type)) {
            machines = new ExcavatorProducer().get();
        } else if (Truck.class.equals(type)) {
            machines = new TruckProducer().get();
        } else {
            machines = new ArrayList<Machine>();
        }
        return (List<T>) machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int number = machines.size();
        for (int i = 0; i < number; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {

    }
}
