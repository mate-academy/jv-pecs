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

    @Override
    public List<Machine> getAll(Class type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            machines = bulldozerProducer.get();
        }
        if (type.equals(Excavator.class)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machines = excavatorProducer.get();
        }
        if (type.equals(Truck.class)) {
            TruckProducer truckProducer = new TruckProducer();
            machines = truckProducer.get();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        if (value.getClass().equals(Bulldozer.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, (Bulldozer) value);
            }
        }
        if (value.getClass().equals(Excavator.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, (Excavator) value);
            }
        }
        if (value.getClass().equals(Truck.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, (Truck) value);
            }
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }

    }
}
