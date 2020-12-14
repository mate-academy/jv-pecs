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
    public List<T> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            BulldozersProducer bulldozer = new BulldozersProducer();
            return new ArrayList<>(bulldozer.get());
        }
        if (type == Excavator.class) {
            ExcavatorsProducer excavator = new ExcavatorsProducer();
            return new ArrayList<>(excavator.get());
        }
        if (type == Truck.class) {
            TrucksProducer truck = new TrucksProducer();
            return new ArrayList<>(truck.get());
        }
        return null;
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}
