package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.producer.BulldozerProducer;
import core.mate.academy.producer.ExcavatorProducer;
import core.mate.academy.producer.TruckProducer;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            BulldozerProducer producer = new BulldozerProducer();
            machines = new ArrayList<>(producer.get());
        }
        if (type == Excavator.class) {
            ExcavatorProducer producer = new ExcavatorProducer();
            machines = new ArrayList<>(producer.get());
        }
        if (type == Truck.class) {
            TruckProducer producer = new TruckProducer();
            machines = new ArrayList<>(producer.get());
        }
        return machines;
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
