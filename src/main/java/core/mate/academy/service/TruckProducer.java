package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List get() {
        Truck truckBlack = new Truck("Black", 6);
        Truck truckWhite = new Truck("White", 8);
        Truck truckRed = new Truck("Red", 4);
        List<Truck> truckList = List.of(truckBlack, truckWhite, truckRed);
        return truckList;
    }
}
