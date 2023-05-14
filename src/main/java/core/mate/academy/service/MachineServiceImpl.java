package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MachineServiceImpl implements MachineService<Machine> {
    private Map<Class<? extends Machine>, MachineProducer<? extends Machine>> producerMap
            = new HashMap<>() {{
                    put(Truck.class, new TruckProducer());
                    put(Excavator.class, new ExcavatorProducer());
                    put(Bulldozer.class, new BulldozerProducer());
                }};

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer = producerMap.get(type);
        return (producerMap.containsKey(type)) ? (List<Machine>) producer.get()
                : Collections.emptyList();
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
