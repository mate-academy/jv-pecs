package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck("Volvo", 12.8, 5000);
    private Truck truck2 = new Truck("MAN", 16.2, 5500);
    private Truck truck3 = new Truck("Mercedes", 10.4, 4000);
    private List<Truck> trucksList = List.of(truck1, truck2, truck3);

    @Override
    public List<Truck> get() {
        return trucksList;
    }
}
