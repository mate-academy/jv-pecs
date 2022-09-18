package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.producer.BulldozerProducer;
import core.mate.academy.service.producer.ExcavatorProducer;
import core.mate.academy.service.producer.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> machineList = new BulldozerProducer();
            return (List<T>) machineList.get();
        } else if (type == Excavator.class) {
            MachineProducer<Excavator> machineList = new ExcavatorProducer();
            return (List<T>) machineList.get();
        } else if (type == Truck.class) {
            MachineProducer<Truck> machineList = new TruckProducer();
            return (List<T>) machineList.get();
        }
        return (List<T>) new ArrayList<Machine>();
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
