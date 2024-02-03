package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.producer.BulldozerProducer;
import core.mate.academy.service.producer.ExcavatorProducer;
import core.mate.academy.service.producer.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machineList = List.of();
        if (Bulldozer.class == type) {
            machineList = new BulldozerProducer().get();
        } else if (Truck.class == type) {
            machineList = new TruckProducer().get();
        } else if (Excavator.class == type) {
            machineList = new ExcavatorProducer().get();
        }
        return new ArrayList<>(machineList);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        machines.clear();
        for (int i = 0; i < size; i++) {
            machines.add(i, value);
        }
    }
}
