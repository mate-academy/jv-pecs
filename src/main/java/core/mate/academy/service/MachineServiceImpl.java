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
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        if (type.equals(Excavator.class)) {
            ExcavatorProducer excavator = new ExcavatorProducer();
            machines = excavator.get();
        } else if (type.equals(Bulldozer.class)) {
            BulldozerProducer bulldozer = new BulldozerProducer();
            machines = bulldozer.get();
        } else if (type.equals(Truck.class)) {
            TruckProducer truck = new TruckProducer();
            machines = truck.get();
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, (Machine) value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
