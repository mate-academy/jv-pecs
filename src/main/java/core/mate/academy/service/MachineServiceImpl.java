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
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer producer = new BulldozerProducer();
            return convertToList(producer.get(), type);
        }
        if (type == Truck.class) {
            TruckProducer producer = new TruckProducer();
            return convertToList(producer.get(), type);
        }

        if (type == Excavator.class) {
            ExcavatorProducer producer = new ExcavatorProducer();
            return convertToList(producer.get(), type);
        }
        return List.of();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
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

    private List<T> convertToList(List<? extends Machine> machines,
                                  Class<? extends T> type) {
        List<T> result = new ArrayList<>();
        for (Machine machine : machines) {
            result.add(type.cast(machine));
        }
        return result;
    }
}
