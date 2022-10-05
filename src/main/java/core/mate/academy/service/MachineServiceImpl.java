package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            MachineProducer<? extends Machine> bulldozerProducer = new BulldozerProducer();
            return new ArrayList<>(new BulldozerProducer().get());
        }
        if (Truck.class.equals(type)) {
            MachineProducer<? extends Machine> truckProducer = new TruckProducer();
            return (List<Machine>) truckProducer.get();
        }
        if (Excavator.class.equals(type)) {
            MachineProducer<? extends Machine> excavatorProducer = new ExcavatorProducer();
            return (List<Machine>) excavatorProducer.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
