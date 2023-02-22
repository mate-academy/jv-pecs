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
    private static final Class TRUCK_CLASS = Truck.class;
    private static final Class BULLDOZER_CLASS = Bulldozer.class;
    private static final Class EXCAVATOR_CLASS = Excavator.class;

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList();
        if (type == TRUCK_CLASS) {
            TruckProducer truckProducer = new TruckProducer();
            for (Truck truck : truckProducer.get()) {
                machines.add(truck);
            }
        } else if (type == BULLDOZER_CLASS) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            for (Bulldozer bulldozer : bulldozerProducer.get()) {
                machines.add(bulldozer);
            }
        } else if (type == EXCAVATOR_CLASS) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            for (Excavator excavator : excavatorProducer.get()) {
                machines.add(excavator);
            }
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
