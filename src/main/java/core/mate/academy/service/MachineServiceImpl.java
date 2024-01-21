package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (!Truck.class.equals(type)) {
            if (!Excavator.class.equals(type)) {
                if (!Bulldozer.class.equals(type)) {
                    return Collections.emptyList();
                }
                BulldozerProducer bulldozerProducer = new BulldozerProducer();
                return new ArrayList<>(bulldozerProducer.get());
            }
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            return new ArrayList<>(excavatorProducer.get());
        }
        TruckProducer truckProducer = new TruckProducer();
        return new ArrayList<>(truckProducer.get());
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
