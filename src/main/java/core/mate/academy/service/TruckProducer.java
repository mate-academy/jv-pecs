package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(15, "Bogdan", "silver"));
        trucks.add(new Truck(10, "Gnom", "brown"));
        trucks.add(new Truck(25, "Titan", "red"));
        return trucks;
    }
}
