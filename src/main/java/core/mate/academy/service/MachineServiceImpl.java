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
    private static final BulldozerProducer BULLDOZER_PRODUCER = new BulldozerProducer();
    private static final ExcavatorProducer EXCAVATOR_PRODUCER = new ExcavatorProducer();
    private static final TruckProducer TRUCK_PRODUCER = new TruckProducer();

    @Override
    public List<Machine> getAll(Class type) {
        List<? extends Machine> result = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            result = BULLDOZER_PRODUCER.get();
        } else if (type.equals(Excavator.class)) {
            result = EXCAVATOR_PRODUCER.get();
        } else if (type.equals(Truck.class)) {
            result = TRUCK_PRODUCER.get();
        }
        return (List<Machine>) result;
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
