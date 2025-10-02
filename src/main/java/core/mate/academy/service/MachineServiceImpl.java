package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bp = new BulldozerProducer();
            return (List<T>) bp.get();
        }
        if (type == Excavator.class) {
            ExcavatorProducer ep = new ExcavatorProducer();
            return (List<T>) ep.get();
        }
        if (type == Truck.class) {
            TruckProducer tp = new TruckProducer();
            return (List<T>) tp.get();
        }
        return List.of();
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine: list) {
            machine.doWork();
        }
    }
}
