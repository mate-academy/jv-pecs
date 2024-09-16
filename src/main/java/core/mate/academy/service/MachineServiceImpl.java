package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducer<Truck> truckProducer = new TruckProducer();
    private final MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
    private final MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Truck.class)) {
            return new ArrayList<>(truckProducer.get());
        } else if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(bulldozerProducer.get());
        } else if (type.equals(Excavator.class)) {
            return new ArrayList<>(excavatorProducer.get());
        }

        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }
}
