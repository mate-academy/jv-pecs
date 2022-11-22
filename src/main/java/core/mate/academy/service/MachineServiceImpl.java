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
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            List<Bulldozer> bulldozers = bulldozerProducer.get();
            return (List<T>) bulldozers;
        } else if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            List<Excavator> excavators = excavatorProducer.get();
            return (List<T>) excavators;
        } else if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            List<Truck> trucks = truckProducer.get();
            return (List<T>) trucks;
        } else {
            List machines = new ArrayList<>();
            return (List<T>) machines;
        }
    }

    @Override
    public void fill(List<? super Machine> machs, T t) {
        int size = machs.size();
        for (int i = 0; i < size; i++) {
            machs.set(i, t);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
