package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        Truck truckFirst = new Truck("Truck 1", "black", "dump");
        Truck truckSecond = new Truck("Truck 2", "red", "chips");
        Truck truckThird = new Truck("Truck 3", "white", "grain");

        List<Truck> truckList = List.of(truckFirst, truckSecond, truckThird);

        return truckList;
    }
}
