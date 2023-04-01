package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machineArrayList = new ArrayList<>();
        if (type != null && type.equals(Bulldozer.class)) {
            MachineProducer producer = new BulldozerProducer();
            machineArrayList = producer.get();
        }
        if (type != null && type.equals(Excavator.class)) {
            MachineProducer producer = new ExcavatorProducer();
            machineArrayList = producer.get();
        }
        if (type != null && type.equals(Truck.class)) {
            MachineProducer producer = new TruckProducer();
            machineArrayList = producer.get();
        }

        return new ArrayList<>(machineArrayList);
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        int size = machines.size();
        machines.clear();
        for (int i = 0; i < size; i++) {
            machines.add(i, (Machine) value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

}
