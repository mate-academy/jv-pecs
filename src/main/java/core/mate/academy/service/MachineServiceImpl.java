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
    public List<T> getAll(Class<? extends T> type) {
        List<? extends Machine> listOfMachines;
        if (type == Bulldozer.class) {
            listOfMachines = new BulldozerProducer().get();
        } else if (type == Truck.class) {
            listOfMachines = new TruckProducer().get();
        } else if (type == Excavator.class) {
            listOfMachines = new ExcavatorProducer().get();
        } else {
            listOfMachines = new ArrayList<>();
        }
        return (List<T>) listOfMachines;
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
