package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.producer.BulldozerProducer;
import core.mate.academy.producer.ExcavatorProducer;
import core.mate.academy.producer.TruckProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();

        if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machines = new ArrayList<>(excavatorProducer.produce());
        }
        if (type == Bulldozer.class) {
            BulldozerProducer dozerProducer = new BulldozerProducer();
            machines = new ArrayList<>(dozerProducer.produce());
        }
        if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            machines = new ArrayList<>(truckProducer.produce());
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
