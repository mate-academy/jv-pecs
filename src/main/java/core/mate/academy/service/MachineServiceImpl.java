package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final MachineProducer BULLDOZER_MACHINE_PRODUCER = new BulldozerProducer();
    private static final MachineProducer EXCAVATOR_MACHINE_PRODUCER = new ExcavatorProducer();
    private static final MachineProducer TRUCK_MACHINE_PRODUCER = new TruckProducer();
    private static final List<Machine> EMPTY_LIST = new ArrayList<>();

    @Override
    public List<Machine> getAll(Class<?> type) {
        if (type == Bulldozer.class) {
            return BULLDOZER_MACHINE_PRODUCER.get();
        } else if (type == Excavator.class) {
            return EXCAVATOR_MACHINE_PRODUCER.get();
        } else if (type == Truck.class) {
            return TRUCK_MACHINE_PRODUCER.get();
        }
        return EMPTY_LIST;
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
