package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(200000, "Scania"));
        trucks.add(new Truck(320000, "Volvo"));
        trucks.add(new Truck(150000, "Man"));
        return trucks;
    }
}
