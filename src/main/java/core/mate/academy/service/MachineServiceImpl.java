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
public class MachineServiceImpl implements MachineService<Machine> {

    TruckProducer truckProducer = new TruckProducer();
    ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    BulldozerProducer bulldozerProducer = new BulldozerProducer();
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Truck.class)) {
            return new ArrayList<>(truckProducer.get());
        }
        if (type.equals(Excavator.class)) {
            return new ArrayList<>(excavatorProducer.get());
        }
        if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(bulldozerProducer.get());
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
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
