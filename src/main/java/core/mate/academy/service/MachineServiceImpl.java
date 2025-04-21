package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */

public class MachineServiceImpl implements MachineService {

    @Override
    public List<Machine> getAll(Class type) {
        if (type == Excavator.class) {
            MachineProducer excavatorProducer = new ExcavatorProducer();
            List<Machine> excavators = excavatorProducer.get();
            return excavators;
        }
        if (type == Bulldozer.class) {
            MachineProducer bulldozerProducer = new BulldozerProducer();
            List<Machine> bulldozers = bulldozerProducer.get();
            return bulldozers;
        }
        if (type == Truck.class) {
            MachineProducer truckProducer = new TruckProducer();
            List<Machine> trucks = truckProducer.get();
            return trucks;
        }
        return List.of();
    }

    @Override
    public void fill(List<Object> machines, Object value) { // <? extends Machine>
        Machine truck = new Truck("A", "B", "C", "D", 1);
        Machine bulldozer = new Bulldozer("A", "B", "C", "D", 1);
        Machine excavator = new Excavator("A", "B", "C", "D", 1);
        if (value instanceof Truck) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, truck);
            }
        }
        if (value instanceof Bulldozer) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, bulldozer);
            }
        }
        if (value instanceof Excavator) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, excavator);
            }
        }

    }

    @Override
    public void startWorking(List<Object> machines) {
        List<Machine> excavators = getAll(ExcavatorProducer.class);
        for (Machine excavator : excavators) {
            excavator.doWork();
        }
        List<Machine> trucks = getAll(TruckProducer.class);
        for (Machine truck : trucks) {
            truck.doWork();
        }
        List<Machine> bulldozers = getAll(BulldozerProducer.class);
        for (Machine bulldozer : bulldozers) {
            bulldozer.doWork();
        }
    }
}
