package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @SuppressWarnings("unchecked")
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer = null;
        if (type.equals(Bulldozer.class)) {
            producer = new BulldozerProducer();
        } else if (type.equals(Excavator.class)) {
            producer = new ExcavatorProducer();
        } else if (type.equals(Truck.class)) {
            producer = new TruckProducer();
        }
        return producer == null ? Collections.EMPTY_LIST : (List<Machine>) producer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Machine::doWork);
    }
}
