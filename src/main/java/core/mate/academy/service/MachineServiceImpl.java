package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.List;
/**
 * Your implementation of MachineService.
 */

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Track.class) {
            MachineProducer producer = new TrackProducer();
            return producer.get();
        }
        if (type == Bulldozer.class) {
            MachineProducer producer = new BulldozerProducer();
            return producer.get();
        }
        if (type == Excavator.class) {
            MachineProducer producer = new ExcavatorProducer();
            return producer.get();
        }
        throw new IllegalArgumentException("Wrong input parameter!!!");
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size * 2; i++) {
            if (i < size) {
                machines.set(i, value);
            } else {
                machines.add(value);
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

