package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private MachineProducer<Bulldozer> bulldozers = new BulldozerProducer();
    private MachineProducer<Excavator> excavators = new ExcavatorProducer();
    private MachineProducer<Truck> trucks = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new ArrayList<>(bulldozers.get());
        }
        if (type == Excavator.class) {
            return new ArrayList<>(excavators.get());
        }
        if (type == Truck.class) {
            return new ArrayList<>(trucks.get());
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
