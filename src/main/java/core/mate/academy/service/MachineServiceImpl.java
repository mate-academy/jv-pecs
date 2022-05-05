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
            List<Bulldozer> listOfBulldozers = new BulldozerProducer().get();
            return new ArrayList<>(listOfBulldozers);
        }
        if (type == Truck.class) {
            List<Truck> listOfTrucks = new TruckProducer().get();
            return new ArrayList<>(listOfTrucks);
        }
        if (type == Excavator.class) {
            List<Excavator> listOfExcavators = new ExcavatorProducer().get();
            return new ArrayList<>(listOfExcavators);
        }
        return new ArrayList<>();
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
