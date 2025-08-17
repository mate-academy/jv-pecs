package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    public List<Machine> getAll(Class<? extends Machine> type) {
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
        return null;
    }

    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
