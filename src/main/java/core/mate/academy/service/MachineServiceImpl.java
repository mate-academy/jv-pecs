package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    private final TruckProducer truckProducer = new TruckProducer();
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();

    @Override
    public List getAll(Class type) {
        if (type == Bulldozer.class) {
            return new ArrayList<>(bulldozerProducer.get());
        }
        if (type == Truck.class) {
            return new ArrayList<>(truckProducer.get());
        }
        if (type == Excavator.class) {
            return new ArrayList<>(excavatorProducer.get());
        }
        return new ArrayList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
