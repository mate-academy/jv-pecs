package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("MAN", "white", 2000, 3500);
        Truck truck2 = new Truck("VOLVO", "red", 3000, 4500);
        Truck truck3 = new Truck("FORD", "black", 2500, 3500);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
