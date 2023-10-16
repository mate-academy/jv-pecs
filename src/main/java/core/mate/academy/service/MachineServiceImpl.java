package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final int NUMBER_OF_BULLDOZERS = 5;
    private static final int NUMBER_OF_EXCAVATORS = 6;
    private static final int NUMBER_OF_TRUCKS = 7;
    private BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private TruckProducer truckProducer = new TruckProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines.addAll(bulldozerProducer.get(NUMBER_OF_BULLDOZERS));
        }
        if (type == Excavator.class) {
            machines.addAll(excavatorProducer.get(NUMBER_OF_EXCAVATORS));
        }
        if (type == Truck.class) {
            machines.addAll(truckProducer.get(NUMBER_OF_TRUCKS));
        }

        return machines;
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
