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
    public List getAll(Class<?> type) {
        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
            return (List<T>) bulldozerProducer.get();
        } else if (type == Excavator.class) {
            MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
            return (List<T>) excavatorProducer.get();
        } else if (type == Truck.class) {
            MachineProducer<Truck> truckProducer = new TruckProducer();
            return (List<T>) truckProducer.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
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
