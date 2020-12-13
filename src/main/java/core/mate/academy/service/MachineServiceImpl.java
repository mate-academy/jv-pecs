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
        if (type == Bulldozer.class) {
            BulldozerProducer producer = new BulldozerProducer();
            List<Machine> bulldozers = new ArrayList<>(producer.get());
            return bulldozers;
        }
        if (type == Truck.class) {
            TruckProducer producer = new TruckProducer();
            List<Machine> trucks = new ArrayList<>(producer.get());
            return trucks;
        }
        if (type == Excavator.class) {
            ExcavatorProducer producer = new ExcavatorProducer();
            List<Machine> excavators = new ArrayList<>(producer.get());
            return excavators;
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
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
