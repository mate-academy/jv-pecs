package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Truck truckOne = new Truck();
        Truck truckTwo = new Truck();
        Truck truckThree = new Truck();
        return List.of(truckOne, truckTwo, truckThree);
    }
}
