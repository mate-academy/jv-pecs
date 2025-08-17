package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.producer.BulldozerProducer;
import core.mate.academy.service.producer.ExcavatorProducer;
import core.mate.academy.service.producer.MachineProducer;
import core.mate.academy.service.producer.TruckProducer;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
    private static final MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
    private static final MachineProducer<Truck> truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case "Bulldozer":
                return new ArrayList<>(bulldozerProducer.get());
            case "Excavator":
                return new ArrayList<>(excavatorProducer.get());
            case "Truck":
                return new ArrayList<>(truckProducer.get());
            default:
                return new ArrayList<>();
        }
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
