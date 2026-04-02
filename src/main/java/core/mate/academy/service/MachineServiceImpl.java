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
    @Override
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> producer = new BulldozerProducer();
            return producer.get();
        } else if (type == Excavator.class) {
            MachineProducer<Excavator> producer = new ExcavatorProducer();
            return producer.get();
        } else if (type == Truck.class) {
            MachineProducer<Truck> producer = new TruckProducer();
            return producer.get();
        }

        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();

        for (int i = 0; i < size; i++) {
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
