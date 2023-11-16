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
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            List<? extends Machine> bulldozers = bulldozerProducer.get();
            return new ArrayList<>(bulldozers);
        } else if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            List<? extends Machine> excavators = excavatorProducer.get();
            return new ArrayList<>(excavators);
        } else if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            List<? extends Machine> trucks = truckProducer.get();
            return new ArrayList<>(trucks);
        } else {
            return new ArrayList<>();
        }
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
