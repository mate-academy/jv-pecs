package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return listOfTrucks();
    }

    private List<Truck> listOfTrucks() {
        Truck truckA = new Truck(45, 3);
        Truck truckB = new Truck(30, 6);
        Truck truckC = new Truck(40, 2);
        truckA.setName("Elena");
        truckB.setName("Paula");
        truckC.setName("Viktoria");
        return List.of(truckA, truckB, truckC);
    }
}
