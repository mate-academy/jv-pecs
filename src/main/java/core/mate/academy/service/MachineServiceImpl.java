package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.producers.BulldozerProducer;
import core.mate.academy.service.producers.ExcavatorProducer;
import core.mate.academy.service.producers.TruckProducer;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            bulldozerProducer.get();
        } else if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            excavatorProducer.get();
        } else if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            truckProducer.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<Object> machines, Machine value) {
        Class type = value.getClass();
        if (type == Bulldozer.class) {
            machines.replaceAll(ignored -> new Bulldozer());
        } else if (type == Excavator.class) {
            machines.replaceAll(ignored -> new Excavator());
        } else if (type == Truck.class) {
            for (int i = 0; i < machines.size(); i++) {
                machines.replaceAll(ignored -> new Truck());
            }
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
