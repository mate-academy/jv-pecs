package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        switch (type.getSimpleName()) {
            case "Truck" :
                machines = new TruckProducer().get();
                break;
            case "Bulldozer" :
                machines = new BulldozerProducer().get();
                break;
            case "Excavator" :
                machines = new ExcavatorProducer().get();
                break;
            default :
                machines = new ArrayList<>();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
