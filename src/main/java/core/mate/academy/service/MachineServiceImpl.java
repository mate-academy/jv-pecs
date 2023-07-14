package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer<T> bulldozerProducer = new BulldozerProducer<>();
            List<Bulldozer> bulldozers = bulldozerProducer.get();
            return (List<T>) bulldozers;
        } else if (type.equals(Excavator.class)) {
            ExcavatorProducer<T> excavatorProducer = new ExcavatorProducer<>();
            List<Excavator> excavators = excavatorProducer.get();
            return (List<T>) excavators;
        } else if (type.equals(Truck.class)) {
            TruckProducer<T> truckProducer = new TruckProducer<>();
            List<Truck> trucks = truckProducer.get();
            return (List<T>) trucks;
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
    public void startWorking(List<? extends T> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
