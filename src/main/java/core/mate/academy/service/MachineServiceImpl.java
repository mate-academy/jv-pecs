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
        MachineProducer producer = getProducer(type);
        if (producer == null) {
            return new ArrayList<>();
        }
        List<? extends Machine> machines = producer.get();
        return new ArrayList<>(machines);
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

    private MachineProducer getProducer(Class type) {
        if (Bulldozer.class.equals(type)) {
            return new BulldozerProducer();
        }
        if (Excavator.class.equals(type)) {
            return new ExcavatorProducer();
        }
        if (Truck.class.equals(type)) {
            return new TruckProducer();
        }
        return null;
    }
}
