package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> truckMachine = new ArrayList<>();
        truckMachine.add(new Truck(15,1900, 15_000));
        truckMachine.add(new Truck(20,2000, 19_000));
        truckMachine.add(new Truck(30,2500, 25_000));
        return truckMachine;
    }
}
