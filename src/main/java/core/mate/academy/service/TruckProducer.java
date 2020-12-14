package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Truck renault = new Truck(8,"Magnum", "Pink");
        Truck volvo = new Truck(7,"FH-Euro-5", "Red");
        trucks.add(renault);
        trucks.add(volvo);
        return trucks;
    }
}
