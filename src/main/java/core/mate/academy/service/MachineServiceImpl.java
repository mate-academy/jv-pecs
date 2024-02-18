package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machineList;
        if (type == Bulldozer.class) {
            machineList = new ArrayList<>(new BulldozerProducer().get());
        } else if (type == Excavator.class) {
            machineList = new ArrayList<>(new ExcavatorProducer().get());
        } else if (type == Truck.class) {
            machineList = new ArrayList<>(new TruckProducer().get());
        } else {
            machineList = new ArrayList<>();
        }
        return machineList;
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
