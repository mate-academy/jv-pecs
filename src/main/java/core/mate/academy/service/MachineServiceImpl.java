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
    public List getAll(Class<? extends Machine> type) {
        MachineProducer producer = null;
        if (Truck.class.equals(type)) {
            producer = new TruckProducer();
        }
        if (Bulldozer.class.equals(type)) {
            producer = new BulldozerProducer();
        }
        if (Excavator.class.equals(type)) {
            producer = new ExcavatorProducer();
        }
        return producer != null ? producer.get() : new ArrayList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }

    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
