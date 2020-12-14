package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final String TYPE_NAME_BULLDOZER = "Bulldozer";
    private static final String TYPE_NAME_EXCAVATOR = "Excavator";
    private static final String TYPE_NAME_Truck = "Truck";
    private static final int COUNT_OF_FILL_LIST = 3;

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.getSimpleName().equals(TYPE_NAME_BULLDOZER)) {
            return new ArrayList<>(new BulldozerProducer().get());
        } else if (type.getSimpleName().equals(TYPE_NAME_EXCAVATOR)) {
            return new ArrayList<>(new ExcavatorProducer().get());
        } else if (type.getSimpleName().equals(TYPE_NAME_Truck)) {
            return new ArrayList<>(new TruckProducer().get());
        }
        return new ArrayList<>();
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
