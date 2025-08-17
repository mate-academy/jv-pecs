package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<?> type) {
        if (type.equals(Bulldozer.class)) {
            List<? extends Machine> bulldozerList = new BulldozerProducer().get();
            return new ArrayList<>(bulldozerList);
        }
        if (Excavator.class.equals(type)) {
            List<? extends Machine> excavatorList = new ExcavatorProducer().get();
            return new ArrayList<>(excavatorList);
        }
        if (Truck.class.equals(type)) {
            List<? extends Machine> truckList = new TruckProducer().get();
            return new ArrayList<>(truckList);
        }
        return Collections.emptyList();
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}
