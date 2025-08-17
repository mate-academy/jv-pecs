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

    public MachineServiceImpl() {
    }

    public List<Machine> getAll(Class type) {
        List<Machine> result = new ArrayList<>();
        if (type == Bulldozer.class) {
            result = new ArrayList<>(bulldozerProducer.get());
        }
        if (type == Excavator.class) {
            result = new ArrayList<>(excavatorProducer.get());
            return result;
        }
        if (type == Truck.class) {
            result = new ArrayList<>(truckProducer.get());;
            return result;
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
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

}
