package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozers = new BulldozerProducer();
            return bulldozers.get();
        } else if (type == Excavator.class) {
            ExcavatorProducer excavators = new ExcavatorProducer();
            return excavators.get();
        } else if (type == Truck.class) {
            TruckProducer trucks = new TruckProducer();
            return trucks.get();
        } else {
            return null;
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {

    }
}
