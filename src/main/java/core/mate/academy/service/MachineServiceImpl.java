package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.producer.BulldozerProducer;
import core.mate.academy.producer.ExcavatorProducer;
import core.mate.academy.producer.TruckProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if (Bulldozer.class.equals(type)) {
            machines = new BulldozerProducer().get();
            return new ArrayList<>(machines);
        } else if (Excavator.class.equals(type)) {
            machines = new ExcavatorProducer().get();
            return new ArrayList<>(machines);
        } else if (Truck.class.equals(type)) {
            machines = new TruckProducer().get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>(){};
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
