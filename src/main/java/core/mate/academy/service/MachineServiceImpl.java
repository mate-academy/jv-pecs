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
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            List<? extends Machine> machines = bulldozerProducer.get();
            return new ArrayList<>(machines);
        } else if (type == Excavator.class) {
            List<? extends Machine> machines = excavatorProducer.get();
            return new ArrayList<>(machines);
        } else if (type == Truck.class) {
            List<? extends Machine> machines = truckProducer.get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        machines.replaceAll(ignored -> (Machine) value);
    }

    @Override
    public void startWorking(List<Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
