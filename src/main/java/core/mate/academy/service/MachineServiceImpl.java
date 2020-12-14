package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final Class TYPE_BULLDOZER = Bulldozer.class;
    private static final Class TYPE_EXCAVATOR = Excavator.class;
    private static final Class TYPE_TRUCK = Truck.class;
    private static final int COUNT_OF_FILL_LIST = 3;

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(TYPE_BULLDOZER)) {
            return new ArrayList<>(new BulldozerProducer().get());
        } else if (type.equals(TYPE_EXCAVATOR)) {
            return new ArrayList<>(new ExcavatorProducer().get());
        } else if (type.equals(TYPE_TRUCK)) {
            return new ArrayList<>(new TruckProducer().get());
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < COUNT_OF_FILL_LIST; i++) {
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
