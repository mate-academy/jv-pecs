package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = new ArrayList<>();

        if (type.equals(Bulldozer.class)) {
            machines = bulldozerProducer.get();
        }
        if (type.equals(Excavator.class)) {
            machines = excavatorProducer.get();
        }
        if (type.equals(Truck.class)) {
            machines = truckProducer.get();
        }
        return new ArrayList<>(machines);
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
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
