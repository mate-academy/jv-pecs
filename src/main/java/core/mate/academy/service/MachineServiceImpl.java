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
        if (Bulldozer.class.equals(type)) {
            List<Machine> listOfBulldozers = new ArrayList<>();
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            listOfBulldozers.addAll((bulldozerProducer.get()));
            return listOfBulldozers;
        } else if (Truck.class.equals(type)) {
            List<Machine> listOfTrucks = new ArrayList<>();
            TruckProducer truckProducer = new TruckProducer();
            listOfTrucks.addAll((truckProducer.get()));
            return listOfTrucks;
        } else if (Excavator.class.equals(type)) {
            List<Machine> listOfExcavator = new ArrayList<>();
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            listOfExcavator.addAll((excavatorProducer.get()));
            return listOfExcavator;
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
