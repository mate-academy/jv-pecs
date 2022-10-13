package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcovatorProducer excovatorProducer = new ExcovatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        List<? extends Machine> machines;

        if (type == Bulldozer.class) {
            machines = bulldozerProducer.get();
        } else if (type == Excavator.class) {
            machines = excovatorProducer.get();
        } else if (type == Truck.class) {
            machines = truckProducer.get();
        } else {
            machines = Collections.emptyList();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
