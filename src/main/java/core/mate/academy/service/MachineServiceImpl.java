package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = null;
        if (type.equals(Bulldozer.class)) {
            machines = new BulldozerProducer().get();
        } else if (type.equals(Excavator.class)) {
            machines = new ExcavatorProducer().get();
        } else if (type.equals(Truck.class)) {
            machines = new TruckProducer().get();
        } else {
            return new ArrayList<>();
        }
        return new ArrayList<T>((Collection<? extends T>) machines);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        if (value.getClass().equals(Bulldozer.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, new Bulldozer());
            }
        } else if (value.getClass().equals(Excavator.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, new Excavator());
            }
        } else if (value.getClass().equals(Truck.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, new Truck());
            }
        }

    }
}
