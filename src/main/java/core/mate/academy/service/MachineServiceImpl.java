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
        MachineProducer<? extends Machine> producer = null;
        if (type == Bulldozer.class) {
            producer = new BulldozerProducer();
        }
        if (type == Excavator.class) {
            producer = new ExcavatorProducer();
        }
        if (type == Truck.class) {
            producer = new TruckProducer();
        }
        return producer != null ? new ArrayList<>(producer.get()) : List.of();
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        machines.replaceAll(ignored -> (Machine) value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
