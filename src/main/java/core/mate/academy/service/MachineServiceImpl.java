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

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override // Wildcard -> because name of type object unknown
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();

        if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machines = new ArrayList<>(excavatorProducer.produce());
        }
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            machines = new ArrayList<>(bulldozerProducer.produce());
        }
        if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            machines = new ArrayList<>(truckProducer.produce());
        }
        return machines;
    }

    @Override //Consumer -> put new collection
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override //Producer -> read data in collection
    public void startWorking(List<? extends Machine> machines) {
        for (Machine m : machines) {
            m.doWork();
        }
    }
}
