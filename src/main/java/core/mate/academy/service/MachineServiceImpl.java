package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final Map<Class, MachineProducer> CLASS_MACHINE_SERVICE_MAP = Map.of(
            Bulldozer.class, new BulldozerProducer(),
            Excavator.class, new ExcavatorProducer(),
            Truck.class, new TruckProducer());

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (CLASS_MACHINE_SERVICE_MAP.get(type) != null) {
            return CLASS_MACHINE_SERVICE_MAP.get(type).get();
        }
        return Collections.emptyList();
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
