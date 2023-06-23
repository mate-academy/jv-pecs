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
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> result = new ArrayList<>();
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            result = bulldozerProducer.get();
        } else if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            result = excavatorProducer.get();
        } else if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            result = truckProducer.get();
        }
        return (List<Machine>) result;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        machines.clear();
        for (int i = 0; i < size; i++) {
            machines.add(value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
