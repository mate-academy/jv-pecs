package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truckOne = new Truck("truckName1", "black", "randomValue1",
                "randomValue2", 3);
        Truck truckTwo = new Truck("truckTwo", "red","randomValue4",
                "randomValue5", 6);
        Truck truckThree = new Truck("truckThree", "white", "randomValue8",
                "randomValue9", 10);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truckOne);
        trucks.add(truckTwo);
        trucks.add(truckThree);
        return trucks;
    }
}
