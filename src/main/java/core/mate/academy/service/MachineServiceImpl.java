package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if ("Bulldozer".equals(type.getSimpleName())) {
            machines = new BulldozerProducer().get();
        } else if ("Truck".equals(type.getSimpleName())) {
            machines = new TruckProducer().get();
        } else if ("Excavator".equals(type.getSimpleName())) {
            machines = new ExcavatorProducer().get();
        } else {
            machines = new ArrayList<>();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        IntStream.range(0, machines.size())
                .forEach(i -> machines.set(i, value));
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }
}
