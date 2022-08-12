package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private Map<Class<? extends Machine>, MachineProducer> machneProducers;

    public MachineServiceImpl() {
        machneProducers = new HashMap<>();
        machneProducers.put(Bulldozer.class, new BulldozerProducer());
        machneProducers.put(Excavator.class, new ExcavatorProducer());
        machneProducers.put(Truck.class, new TruckProducer());
    }

    @Override
    public List getAll(Class<? extends Machine> type) {
        MachineProducer machineProducer = machneProducers.get(type);
        if (machineProducer == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(machineProducer.get());
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}
