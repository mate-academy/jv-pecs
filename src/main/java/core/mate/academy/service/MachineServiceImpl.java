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
public class MachineServiceImpl<T> implements MachineService<T> {
    private static final MachineProducer BULLDOZER_PRODUCER = new BulldozerProducer();
    private static final ExcavatorProducer EXCAVATOR_PRODUCER = new ExcavatorProducer();
    private static final TruckProducer TRUCK_PRODUCER = new TruckProducer();

    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<? extends Machine> result = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            result = BULLDOZER_PRODUCER.get();
        } else if (type.equals(Excavator.class)) {
            result = EXCAVATOR_PRODUCER.get();
        } else if (type.equals(Truck.class)) {
            result = TRUCK_PRODUCER.get();
        }
        return (List<T>) result;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Object machine : machines) {
            ((Machine) machine).doWork();
        }
    }
}
