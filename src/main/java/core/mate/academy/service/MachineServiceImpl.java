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
public class MachineServiceImpl<T extends Machine> implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> list = new ArrayList<>();

        if (type == Bulldozer.class) {
            BulldozerProducer producer = new BulldozerProducer();

            return new ArrayList<>(producer.get());
        }

        if (type == Excavator.class) {
            ExcavatorProducer producer = new ExcavatorProducer();

            return new ArrayList<>(producer.get());
        }

        if (type == Truck.class) {
            TruckProducer producer = new TruckProducer();

            return new ArrayList<>(producer.get());
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
