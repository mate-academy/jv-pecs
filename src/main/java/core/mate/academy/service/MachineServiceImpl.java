package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MachineServiceImpl implements MachineService<Machine> {
    private Map<Class<? extends Machine>,
                MachineProducer<? extends Machine>> machineProducerMap;

    public MachineServiceImpl() {
        machineProducerMap = new HashMap<>();
        machineProducerMap.put(Bulldozer.class, new BulldozerProducer());
        machineProducerMap.put(Excavator.class, new ExcavatorProducer());
        machineProducerMap.put(Truck.class, new TruckProducer());
    }

    @Override

    public List<Machine> getAll(Class type) {
        List<Machine> machines = new ArrayList<>();
        MachineProducer<? extends Machine> machineProducer = machineProducerMap.get(type);
        if (machineProducer != null) {
            machines.addAll(machineProducer.get());
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }

    }
}
