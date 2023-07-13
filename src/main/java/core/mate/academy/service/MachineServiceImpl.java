package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer<T> bulldozerProducer = new BulldozerProducer<>();
            return (List<T>) bulldozerProducer.get();
        } else if (type.equals(Excavator.class)) {
            ExcavatorProducer<T> excavatorProducer = new ExcavatorProducer<>();
            return (List<T>) excavatorProducer.get();
        } else if (type.equals(Truck.class)) {
            TruckProducer<T> truckProducer = new TruckProducer<>();
            return (List<T>) truckProducer.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
