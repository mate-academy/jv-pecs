package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private MachineProducer<Bulldozer> bullProducer = new BulldozerProducer();
    private MachineProducer<Excavator> excProducer = new ExcavatorProducer();
    private MachineProducer<Truck> truProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(bullProducer.get());
        }
        if (type.equals(Excavator.class)) {
            return new ArrayList<>(excProducer.get());
        }
        if (type.equals(Truck.class)) {
            return new ArrayList<>(truProducer.get());
        }
        return new ArrayList<>();
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
