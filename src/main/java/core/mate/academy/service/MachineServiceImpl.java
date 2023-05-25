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
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> listOfMachines;
        if (type == Bulldozer.class) {
            listOfMachines = new BulldozerProducer().get();
        } else if (type == Excavator.class) {
            listOfMachines = new ExcavatorProducer().get();
        } else if (type == Truck.class) {
            listOfMachines = new TruckProducer().get();
        } else {
            listOfMachines = new ArrayList<>();
        }
        return (List<Machine>) listOfMachines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

