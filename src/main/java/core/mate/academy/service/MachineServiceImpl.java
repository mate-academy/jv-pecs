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

    @SuppressWarnings("unchecked")
    @Override
    public <V extends Machine> List<V> getAll(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            return (List<V>) bulldozerProducer.get();
        } else if (Excavator.class.equals(type)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            return (List<V>) excavatorProducer.get();
        } else if (Truck.class.equals(type)) {
            TruckProducer truckProducer = new TruckProducer();
            return (List<V>) truckProducer.get();
        }
        return new ArrayList<>();
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
