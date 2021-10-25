package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private Truck truck1 = new Truck("Volvo", "white", 40);
    private Truck truck2 = new Truck("Scania", "red", 35);
    private Truck truck3 = new Truck("Mercedes-Benz", "white", 20);

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
