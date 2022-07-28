package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(500, "Kraz", "black"));
        trucks.add(new Truck(450, "Zil", "white"));
        trucks.add(new Truck(400, "Man", "blue"));
        return trucks;
    }
}
