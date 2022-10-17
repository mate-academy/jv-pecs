package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final Map<Class<? extends Machine>,
            MachineProducer<? extends Machine>> producerMap = Map.of(
            Bulldozer.class, new BulldozerProducer(),
            Truck.class, new TruckProducer(),
            Excavator.class, new ExcavatorProducer()
    );

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        return producerMap.containsKey(type) ? new ArrayList<>(producerMap.get(type).get())
                : Collections.emptyList();
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
