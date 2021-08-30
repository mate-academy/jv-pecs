package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck(50, 150, "Freightliner", "White");
        Truck truck2 = new Truck(45, 170, "Mercedes-Benz", "Silver");
        Truck truck3 = new Truck(20, 190, "Volvo", "Red");
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
