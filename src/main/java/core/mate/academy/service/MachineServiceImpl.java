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
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer producer = new BulldozerProducer();
            List<? extends Machine> machines = producer.get();
            return new ArrayList<>(machines);
        } else if (type.equals(Excavator.class)) {
            ExcavatorProducer producer = new ExcavatorProducer();
            List<? extends Machine> machines = producer.get();
            return new ArrayList<>(machines);
        } else if (type.equals(Truck.class)) {
            TruckProducer producer = new TruckProducer();
            List<? extends Machine> machines = producer.get();
            return new ArrayList<>(machines);
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
