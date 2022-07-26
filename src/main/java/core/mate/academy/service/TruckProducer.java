package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckOne = new Truck("truckOne", "black", "SuperCargo");
        Truck truckTwo = new Truck("truckTwo", "blue", "Standard");
        Truck truckThree = new Truck("truckThree", "green", "Wagon");
        return List.of(truckOne, truckTwo, truckThree);
    }
}
