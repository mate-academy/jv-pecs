package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.producerimpl.BulldozerProducer;
import core.mate.academy.service.producerimpl.ExcavatorProducer;
import core.mate.academy.service.producerimpl.TruckProducer;

import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    BulldozerProducer bulldozerProducer = new BulldozerProducer();
    ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    TruckProducer truckProducer = new TruckProducer();
    List<Machine> machines = new ArrayList<>();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            machines = bulldozerProducer.get();
        } else if (type == Excavator.class) {
            machines = excavatorProducer.get();
        } else if (type == Truck.class) {
            machines = truckProducer.get();
        } else {
            machines = new ArrayList<>();
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
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.get(i).doWork();
        }
    }
}
