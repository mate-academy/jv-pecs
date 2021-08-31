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
        BulldozerProducer<Bulldozer> bulldozers = new BulldozerProducer<>();
        TruckProducer<Truck> trucks = new TruckProducer<>();
        ExcavatorProducer<Excavator> excavators = new ExcavatorProducer<>();
        List<T> list = new ArrayList<>();
        if (type == Bulldozer.class) {
            list = (List<T>) bulldozers.get();
        }
        if (type == Excavator.class) {
            list = (List<T>) excavators.get();

        }
        if (type == Truck.class) {
            list = (List<T>) trucks.get();
        }
        return list;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }

    }

}
