package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();

        truck1.setName("Truck1");
        truck2.setName("Truck2");
        truck3.setName("Truck3");

        truck1.setColor("Black");
        truck2.setColor("Yellow");
        truck3.setColor("White");

        truck1.setTrailerLength(3);
        truck2.setTrailerLength(4);
        truck3.setTrailerLength(5);

        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
