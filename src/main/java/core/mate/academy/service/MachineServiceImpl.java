package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer;
        switch (type.getSimpleName()) {
            case "Bulldozer" -> producer = new BulldozerProducerImpl();
            case "Excavator" -> producer = new ExcavatorProducerImpl();
            case "Truck" -> producer = new TruckProducerImpl();
            default -> {
                return Collections.emptyList();
            }
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
        machines.forEach(Workable::doWork);
    }
}
