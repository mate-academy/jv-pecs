package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> result = Collections.emptyList();
        List<? extends Machine> machines;
        if (type == Bulldozer.class) {
            machines = bulldozerProducer.get();
            result = new ArrayList<>(machines);
        } else if (type == Excavator.class) {
            machines = excavatorProducer.get();
            result = new ArrayList<>(machines);
        } else if (type == Truck.class) {
            machines = truckProducer.get();
            result = new ArrayList<>(machines);
        }
        return result;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine element : machines) {
            element.doWork();
        }
    }
}
