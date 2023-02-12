package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final MachineProducer<Bulldozer> BULLDOZER_PRODUCER = new BulldozerProducer();
    private static final MachineProducer<Excavator> EXCAVATOR_PRODUCER = new ExcavatorProducer();
    private static final MachineProducer<Truck> TRUCK_PRODUCER = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer;
        if (type == Bulldozer.class) {
            producer = BULLDOZER_PRODUCER;
        } else if (type == Excavator.class) {
            producer = EXCAVATOR_PRODUCER;
        } else if (type == Truck.class) {
            producer = TRUCK_PRODUCER;
        } else {
            return new LinkedList<>();
        }

        List<? extends Machine> machines = producer.get();
        return new ArrayList<>(machines);
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
