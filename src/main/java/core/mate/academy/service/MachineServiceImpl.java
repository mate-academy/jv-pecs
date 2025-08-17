package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.producers.BulldozerProducer;
import core.mate.academy.service.producers.ExcavatorProducer;
import core.mate.academy.service.producers.TruckProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<Machine> machineProducer;
        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
        } else if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
        } else if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
        } else {
            return new ArrayList<>();
        }
        return machineProducer.get();

    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
