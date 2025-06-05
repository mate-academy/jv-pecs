package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.producer.BulldozerProducer;
import core.mate.academy.model.producer.ExcavatorProducer;
import core.mate.academy.model.producer.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    public static final String BULLDOZER = "core.mate.academy.model.Bulldozer";
    public static final String TRUCK = "core.mate.academy.model.Truck";
    public static final String EXCAVATOR = "core.mate.academy.model.Excavator";

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer;

        switch (type.getName()) {
            case BULLDOZER:
                producer = new BulldozerProducer();
                break;
            case TRUCK:
                producer = new TruckProducer();
                break;
            case EXCAVATOR:
                producer = new ExcavatorProducer();
                break;
            default:
                return new ArrayList<>();
        }

        return (List<Machine>) producer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
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
}
